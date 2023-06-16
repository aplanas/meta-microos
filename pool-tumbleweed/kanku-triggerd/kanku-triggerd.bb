SUMMARY = "Trigger daemon for kanku"
DESCRIPTION = "A triggerd for kanku based on RabbitMQ."
LICENSE = "GPL-3.0-only"

PV = "0.14.0"

RPM_NAME = "kanku-triggerd-0.14.0-1.3.noarch.rpm"
RPM_HASH = "22a4c4fd6cd1755a4d7460953d0b43afdeeb19d1d7f3708c9c3ae3f6d3ef8913fa80ecdd56e784836d69e48c291bcaddbbf90b18362013f419647efb7a8cd491"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kanku-triggerd \
perl-Kanku--Daemon--TriggerD \
perl-Kanku--Listener--RabbitMQ"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
kanku-common \
kanku-common-server"

inherit rpm
