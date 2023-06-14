SUMMARY = "The GNU Compiler Collection targeting arm"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting arm. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-arm-gcc12-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "b96f8af5b47ef9ad74911f3b3545e0cadb6bfef4a56280577eb0b61518b359bc49a7cf83f29373b5ded0f3ab2eb623188d9cdeaaf2a2b198c5e42b94763960bd"

RPROVIDES:${PN} += "cross-arm-gcc12"

RDEPENDS:${PN} += "/bin/sh \
cross-arm-binutils \
libstdc++6-devel-gcc12 \
update-alternatives"

inherit rpm
