SUMMARY = "WebUI for kanku"
DESCRIPTION = "WebUI for kanku using perl Dancer"
LICENSE = "GPL-3.0-only"

PV = "0.14.0"

RPM_NAME = "kanku-web-0.14.0-1.5.noarch.rpm"
RPM_HASH = "02299c54cae481ba724495d8cf6e446d44c2d157df5521d714b492632fc763655a7634369223550409f946792c24af938473d21cc60d5c54385c577a139cc0ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-kanku-web \
kanku-web \
perl-Dancer2--Plugin--GitLab--Webhook \
perl-Kanku \
perl-Kanku--REST \
perl-Kanku--REST--Admin--Role \
perl-Kanku--REST--Admin--Task \
perl-Kanku--REST--Admin--User \
perl-Kanku--REST--Guest \
perl-Kanku--REST--Job \
perl-Kanku--REST--JobComment \
perl-Kanku--REST--JobGroup \
perl-Kanku--REST--Worker"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/sh \
kanku-common \
kanku-common-server \
perl-Dancer2--Plugin--WebSocket \
perl-Mail--Message--Body--String \
perl-Mail--Transport--Send \
perl-Net--AMQP--RabbitMQ \
perl-Template--Plugin--JSON--Escape \
perl-Twiggy \
perl-UUID \
smtp-daemon"

inherit rpm
