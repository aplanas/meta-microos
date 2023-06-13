SUMMARY = "Dispatcher daemon for kanku"
DESCRIPTION = "A dispatcher for kanku based on RabbitMQ."
LICENSE = "GPL-3.0-only"

PV = "0.14.0"

RPM_NAME = "kanku-dispatcher-0.14.0-1.3.noarch.rpm"
RPM_HASH = "15d3923ae8ca868f6e7807db05d60c22d7632566a10723dbc58e8079853c53e6d1be43f7c7c65252ed24896c3d655d734e078b6a680fbda8a0d16e966a1becc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kanku-dispatcher \
perl(Kanku::Daemon::Dispatcher) \
perl(Kanku::Dispatch::RabbitMQ)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/env \
kanku-common \
kanku-common-server \
perl(Net::AMQP::RabbitMQ) \
sudo"

inherit rpm
