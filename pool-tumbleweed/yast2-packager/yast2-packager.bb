SUMMARY = "YaST2 - Package Library"
DESCRIPTION = "This package contains the libraries and modules for software management."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.2"

RPM_NAME = "yast2-packager-4.6.2-1.1.aarch64.rpm"
RPM_HASH = "c4df12ed1f0572d88273a6ae67c6330ee5f1fa586fe13a386993e8d020aeda3c7b38c5d0ede7f64bff065fb41896d17f44067d1492d9a6f7aa880a309dd4464a"

RPROVIDES:${PN} += "yast2-packager"

RDEPENDS:${PN} += "/usr/bin/bash \
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
