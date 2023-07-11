SUMMARY = "Job queue"
DESCRIPTION = "Minion is a high performance job queue for the Perl programming language, \
with support for multiple named queues, priorities, high priority fast \
lane, delayed jobs, job dependencies, job progress, job results, retries \
with backoff, rate limiting, unique jobs, expiring jobs, statistics, \
distributed workers, parallel processing, autoscaling, remote control, at \
https://mojolicious.org admin ui, resource leak protection and multiple \
backends (such as at https://www.postgresql.org). \
 \
Job queues allow you to process time and/or computationally intensive tasks \
in background processes, outside of the request/response lifecycle of web \
applications. Among those tasks you'll commonly find image resizing, spam \
filtering, HTTP downloads, building tarballs, warming caches and basically \
everything else you can imagine that's not super fast. \
 \
Take a look at our excellent documentation in Minion::Guide!"
LICENSE = "Artistic-2.0"

PV = "10.25"

RPM_NAME = "perl-Minion-10.25-1.5.noarch.rpm"
RPM_HASH = "758cd70c9aef9fbbdcefe19fb2319da50a747420c775584895cfc6e3aeaf5056bafecfc93f2371ba10ae3730cfe55a3d53b8e7168a872c40baa56f8295db698b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Minion \
perl-Minion--Backend \
perl-Minion--Backend--Pg \
perl-Minion--Command--minion \
perl-Minion--Command--minion--job \
perl-Minion--Command--minion--worker \
perl-Minion--Iterator \
perl-Minion--Job \
perl-Minion--Worker \
perl-Mojolicious--Plugin--Minion \
perl-Mojolicious--Plugin--Minion--Admin"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Mojolicious \
perl-YAML--XS"

inherit rpm
