SUMMARY = "YaST2 - Storage Configuration"
DESCRIPTION = "This package contains the files for YaST2 that handle access to disk \
devices during installation and on an installed system. \
This YaST2 module uses libstorage-ng."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.6.11"

RPM_NAME = "yast2-storage-ng-4.6.11-1.1.aarch64.rpm"
RPM_HASH = "e8e83b292e3ecf8a82814e474a2b4463252c00bc4a2666b82b9f75443413bb3e6275645e0b5670d6355e6395557277e42c3b5e3e04f3820029b7e86767ef9de9"

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
