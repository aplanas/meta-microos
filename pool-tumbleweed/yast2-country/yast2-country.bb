SUMMARY = "YaST2 - Country Settings (Language, Keyboard, and Timezone)"
DESCRIPTION = "Country specific data and configuration modules (language, keyboard, \
timezone) for yast2."
LICENSE = "GPL-2.0-only"

PV = "4.6.3"

RPM_NAME = "yast2-country-4.6.3-1.1.aarch64.rpm"
RPM_HASH = "675bfc2f8205632af71cb6ad49faef8ee0b259e79ec1c4ad199bfa6513b6c0a33ed8e583f25eddd08ec2dc8adefa615b5805ccb0d236c6f1ff56bcceb10695b3"

RPROVIDES:${PN} += "perl-YaPI--LANGUAGE \
perl-YaPI--TIME \
yast2-country"

RDEPENDS:${PN} += "rubygem-ruby-3.2.0-ruby-dbus \
timezone \
yast2 \
yast2-core \
yast2-country-data \
yast2-hardware-detection \
yast2-packager \
yast2-perl-bindings \
yast2-pkg-bindings \
yast2-ruby-bindings \
yast2-trans-stats"

inherit rpm
