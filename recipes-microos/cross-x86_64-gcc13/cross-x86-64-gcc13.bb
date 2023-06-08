SUMMARY = "The GNU Compiler Collection targeting x86_64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting x86_64. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.0.1+git7231"

RPM_NAME = "cross-x86_64-gcc13-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "03f33fe71dd596deb19645a1ffd9e2a903c46224e54b0b094fc9ccb5947dfc34c6d7b4112706df7b41efcb5a51fcfd99fe9939bf8293f55914a9643820dc4bc5"

RPROVIDES:${PN} += "cross-x86_64-gcc13 cross-x86_64-gcc13(aarch-64)"
RDEPENDS:${PN} += "/bin/sh cross-x86_64-binutils libstdc++6-devel-gcc13 update-alternatives"

inherit rpm
