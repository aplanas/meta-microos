SUMMARY = "The GNU Compiler Collection targeting arm"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting arm. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7597"

RPM_NAME = "cross-arm-gcc13-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "b98ce33fd4accc71f7901a627801481b6613f4f322151e4407adf85709c2a3e1fa8a9f752d7878560595aa808236515b5784785d801255dbd7c27b5490e7c610"

RPROVIDES:${PN} += "cross-arm-gcc13"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-arm-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
