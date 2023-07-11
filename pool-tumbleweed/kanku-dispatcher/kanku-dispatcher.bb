SUMMARY = "Dispatcher daemon for kanku"
DESCRIPTION = "A dispatcher for kanku based on RabbitMQ."
LICENSE = "GPL-3.0-only"

PV = "0.14.0"

RPM_NAME = "kanku-dispatcher-0.14.0-1.5.noarch.rpm"
RPM_HASH = "6ac10e121e70a54174b8ecd118abba67c920534c537f2a3c139521bfbcd515e8a2224c939313e4dbc8e95fc365978ed8a74487bb99a410f0dbb5543b1e093cf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kanku-dispatcher \
perl-Kanku--Daemon--Dispatcher \
perl-Kanku--Dispatch--RabbitMQ"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
kanku-common \
kanku-common-server \
perl-Net--AMQP--RabbitMQ \
sudo"

inherit rpm
