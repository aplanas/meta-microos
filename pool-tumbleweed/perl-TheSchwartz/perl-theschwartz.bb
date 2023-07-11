SUMMARY = "Reliable job queue"
DESCRIPTION = "TheSchwartz is a reliable job queue system. Your application can put jobs \
into the system, and your worker processes can pull jobs from the queue \
atomically to perform. Failed jobs can be left in the queue to retry later. \
 \
_Abilities_ specify what jobs a worker process can perform. Abilities are \
the names of 'TheSchwartz::Worker' sub-classes, as in the synopsis: the \
'MyWorker' class name is used to specify that the worker script can perform \
the job. When using the 'TheSchwartz' client's 'work' functions, the \
class-ability duality is used to automatically dispatch to the proper class \
to do the actual work. \
 \
TheSchwartz clients will also prefer to do jobs for unused abilities before \
reusing a particular ability, to avoid exhausting the supply of one kind of \
job while jobs of other types stack up. \
 \
Some jobs with high setup times can be performed more efficiently if a \
group of related jobs are performed together. TheSchwartz offers a facility \
to _coalesce_ jobs into groups, which a properly constructed worker can \
find and perform at once. For example, if your worker were delivering \
email, you might store the domain name from the recipient's address as the \
coalescing value. The worker that grabs that job could then batch deliver \
all the mail for that domain once it connects to that domain's mail server."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.17"

RPM_NAME = "perl-TheSchwartz-1.17-1.8.noarch.rpm"
RPM_HASH = "d2f425ea7e7e428538403cf0079905c5f3b2a8805a5a70e86cc12a9e99b3623512d517d546ecdbb13bd0c27a4f695893d2d7bf34b227b75df3b4287004a6838d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-TheSchwartz \
perl-TheSchwartz--Error \
perl-TheSchwartz--ExitStatus \
perl-TheSchwartz--FuncMap \
perl-TheSchwartz--Job \
perl-TheSchwartz--JobHandle \
perl-TheSchwartz--Worker"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1 \
perl-Class--Accessor--Fast \
perl-Data--ObjectDriver"

inherit rpm
