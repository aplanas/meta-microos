SUMMARY = "Openscap utilities"
DESCRIPTION = "The openscap-utils package contains various utilities based on openscap library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.8"

RPM_NAME = "openscap-utils-1.3.8-1.1.aarch64.rpm"
RPM_HASH = "a585b18d37fe130e1218c36a3a3af9032986f18d18d972fc410a45545d5c942a7b429d7abc1874c70870df779fae33b78ffeb24fee27c7a6c244ba395f4fe3f8"

RPROVIDES:${PN} += "openscap-utils"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libopenscap.so.25 \
libopenscap25 \
openscap \
systemd"

inherit rpm
