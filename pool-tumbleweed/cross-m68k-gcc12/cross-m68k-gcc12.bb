SUMMARY = "The GNU Compiler Collection targeting m68k"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting m68k. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-m68k-gcc12-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "a25e518d6244ce5a4acc44f35792403d7ae6ddd4f0048d101a35e783e236640b7499aca226ab438b260dde8b38fe7ecc9712d36029b7df19e48b1f9fda3b67af"

RPROVIDES:${PN} += "cross-m68k-gcc12 \
cross-m68k-gcc12(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
cross-m68k-binutils \
libstdc++6-devel-gcc12 \
update-alternatives"

inherit rpm
