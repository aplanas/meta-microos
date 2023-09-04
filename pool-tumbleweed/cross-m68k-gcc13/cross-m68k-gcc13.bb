SUMMARY = "The GNU Compiler Collection targeting m68k"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting m68k. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-m68k-gcc13-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "d90daf909893ea46a23cc8a48b4d0c784c2914d2b55baa31ed7f95504b980beb8c930e015b92857b6975c251160c8b0f603019181884c981f8feae9bc5556734"

RPROVIDES:${PN} += "cross-m68k-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-m68k-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
