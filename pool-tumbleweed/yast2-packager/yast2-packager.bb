SUMMARY = "YaST2 - Package Library"
DESCRIPTION = "This package contains the libraries and modules for software management."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1"

RPM_NAME = "yast2-packager-4.6.1-1.1.aarch64.rpm"
RPM_HASH = "14f2be88f768543eb37d9b0571e4525a3defca6fcf5e690bd25640e31e50428c82f74c2c28f55bd0f5d20da61e694999e78e9ddccb7cfdd578bc7392b9d604d7"

RPROVIDES:${PN} += "yast2-packager"

RDEPENDS:${PN} += "/bin/bash \
/usr/bin/md5sum \
/usr/bin/perl \
augeas-lenses \
libyui-pkg \
ruby-solv \
rubygem-ruby-3.2.0-cfa \
rubygem-ruby-3.2.0-nokogiri \
unzip \
yast2 \
yast2-core \
yast2-country-data \
yast2-pkg-bindings \
yast2-ruby-bindings \
yast2-storage-ng \
yast2-transfer"

inherit rpm
