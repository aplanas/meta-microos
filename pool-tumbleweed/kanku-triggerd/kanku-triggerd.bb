SUMMARY = "Trigger daemon for kanku"
DESCRIPTION = "A triggerd for kanku based on RabbitMQ."
LICENSE = "GPL-3.0-only"

PV = "0.14.0"

RPM_NAME = "kanku-triggerd-0.14.0-1.5.noarch.rpm"
RPM_HASH = "f0ab7888109cc91e968d51333aefdf54c7415633c4f663973e0e59057e6c66e8ebb98b1a04f55a4beef768f995e9c65bf14ac8e2aa3f7328fe1fc3fa9e89b6b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kanku-triggerd \
perl-Kanku--Daemon--TriggerD \
perl-Kanku--Listener--RabbitMQ"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
kanku-common \
kanku-common-server"

inherit rpm
