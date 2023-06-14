SUMMARY = "The GNU Compiler Collection targeting sparcv9"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting sparcv9. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-sparc-gcc13-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "ada655aabf11ea27c526d82f7e1ed3a5f2cacbd87f9a08328bc57c6792f065efe15a4245530ee3e63508b63e224a0fa4f023746ee65698c230f91d15c4a14a17"

RPROVIDES:${PN} += "cross-sparc-gcc13"

RDEPENDS:${PN} += "/bin/sh \
cross-sparc-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
