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

RPM_NAME = "perl-Minion-10.25-1.4.noarch.rpm"
RPM_HASH = "21bd974d89cf7d723802b39fc01062989d5ed2e8c3844a0ada77e241ada0c073a9d0a76f5a45ca34ca9f245801fafa527f46932da64eebb4bfe46ad1487eb287"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Minion) \
perl(Minion::Backend) \
perl(Minion::Backend::Pg) \
perl(Minion::Command::minion) \
perl(Minion::Command::minion::job) \
perl(Minion::Command::minion::worker) \
perl(Minion::Iterator) \
perl(Minion::Job) \
perl(Minion::Worker) \
perl(Mojolicious::Plugin::Minion) \
perl(Mojolicious::Plugin::Minion::Admin) \
perl-Minion"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Mojolicious) \
perl(YAML::XS)"

inherit rpm
