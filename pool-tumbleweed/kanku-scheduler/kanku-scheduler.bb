SUMMARY = "Scheduler daemon for kanku"
DESCRIPTION = "A scheduler for kanku based on RabbitMQ."
LICENSE = "GPL-3.0-only"

PV = "0.14.0"

RPM_NAME = "kanku-scheduler-0.14.0-1.3.noarch.rpm"
RPM_HASH = "15caff9f845358f452f0d34c533a4c5016a6bfad778d218778d077b0ea7026f2bd562bdc1cc25854b793dc54615579a5ceb1a50e6764baa5cc5a04ee8f365e19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kanku-scheduler \
perl(Kanku::Daemon::Scheduler)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/env \
kanku-common \
kanku-common-server"

inherit rpm
