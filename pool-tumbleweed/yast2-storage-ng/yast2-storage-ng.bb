SUMMARY = "YaST2 - Storage Configuration"
DESCRIPTION = "This package contains the files for YaST2 that handle access to disk \
devices during installation and on an installed system. \
This YaST2 module uses libstorage-ng."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.6.12"

RPM_NAME = "yast2-storage-ng-4.6.12-1.1.aarch64.rpm"
RPM_HASH = "dbdeaf39ecb90cdb9fb3bd147cc1147afcc619c6becb8fc1a34a16f1febe33a1d7fac86ef9d2233314002a02785507f6b3b70c89dc8703d95e36f58d22fb53b4"

RPROVIDES:${PN} += "yast2-storage-ng"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
findutils \
libstorage-ng-ruby \
rubygem-ruby-3.2.0-ruby-dbus \
yast2 \
yast2-packager \
yast2-ruby-bindings \
yast2-ycp-ui-bindings"

inherit rpm
