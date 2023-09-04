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

RPM_NAME = "perl-TheSchwartz-1.17-1.9.noarch.rpm"
RPM_HASH = "b6d5dc19e89227e9a44dec5e8e2fdd322d92db299f08650a3d921b3a90cc3a419ceb02dfbe7f4f6abe38918bf7b192ac84ef7545f86b309837b55b4fa9029996"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-TheSchwartz \
perl-TheSchwartz--Error \
perl-TheSchwartz--ExitStatus \
perl-TheSchwartz--FuncMap \
perl-TheSchwartz--Job \
perl-TheSchwartz--JobHandle \
perl-TheSchwartz--Worker"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0 \
perl-Class--Accessor--Fast \
perl-Data--ObjectDriver"

inherit rpm
