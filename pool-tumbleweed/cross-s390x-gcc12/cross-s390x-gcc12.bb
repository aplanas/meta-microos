SUMMARY = "The GNU Compiler Collection targeting s390x"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting s390x. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-s390x-gcc12-12.3.0+git1204-1.2.aarch64.rpm"
RPM_HASH = "175d4a21b92851b5b8ee850781db3257d77d25287479ae6af847f60779197009d75e04db14d55498ca4dc5db4a8505b9875164fa420f5ec7ce2cd4fe2239957e"

RPROVIDES:${PN} += "cross-s390x-gcc12"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-s390x-binutils \
libstdc++6-devel-gcc12 \
update-alternatives"

inherit rpm
