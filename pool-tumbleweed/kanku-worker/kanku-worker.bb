SUMMARY = "Worker daemon for kanku"
DESCRIPTION = "A remote worker for kanku based on RabbitMQ."
LICENSE = "GPL-3.0-only"

PV = "0.14.0"

RPM_NAME = "kanku-worker-0.14.0-1.5.noarch.rpm"
RPM_HASH = "8638fdfcc1a61174a1b319d0b682506001e1f1c3964c7a01abc6162e5704ef749ea44b07334c33cbc78b9ba6347d2a2b22b34ffa5cff2394baa6e5e4d1a46f89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kanku-worker \
perl-Kanku--Daemon--Worker"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
kanku-common \
kanku-common-server \
perl-Net--AMQP--RabbitMQ \
perl-Sys--CPU \
perl-Sys--LoadAvg \
perl-Sys--MemInfo \
perl-UUID \
qemu-arm"

inherit rpm
