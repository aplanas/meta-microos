SUMMARY = "Scheduler daemon for kanku"
DESCRIPTION = "A scheduler for kanku based on RabbitMQ."
LICENSE = "GPL-3.0-only"

PV = "0.14.0"

RPM_NAME = "kanku-scheduler-0.14.0-1.5.noarch.rpm"
RPM_HASH = "9922abcff3a5a1792947ff005ad2f38d531354d0f157ccc5c1f721d2128e69ee1e9a614c4c0a75cbba5fab8babea4e65aa44096737ea5dfdea93699db703a28a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kanku-scheduler \
perl-Kanku--Daemon--Scheduler"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
kanku-common \
kanku-common-server"

inherit rpm
