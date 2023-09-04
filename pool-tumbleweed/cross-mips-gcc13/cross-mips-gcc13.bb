SUMMARY = "The GNU Compiler Collection targeting mips"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting mips. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cross-mips-gcc13-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "b2bc1c4a905ef409385087c5ecf26f91f61a5489e299dee77de703883133ff3c7403469780a12d9169aaa6a7afadb900a27c2105ff79e589a7f1845f65920468"

RPROVIDES:${PN} += "cross-mips-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-mips-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
