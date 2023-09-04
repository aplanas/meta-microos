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

RPM_NAME = "perl-Minion-10.25-1.6.noarch.rpm"
RPM_HASH = "df4c0d7d4eba0bc37a9a829c6c9d127f1aee58287af43c5b9d57b2f56580bae6c7ad20ecc46a1aa09c0d4b55dc5d63b4ed3c531ded448b6d98255d39a5f5935f"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Mojolicious \
perl-YAML--XS"

inherit rpm
