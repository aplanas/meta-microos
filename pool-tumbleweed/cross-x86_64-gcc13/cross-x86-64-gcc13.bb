SUMMARY = "The GNU Compiler Collection targeting x86_64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting x86_64. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-x86_64-gcc13-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "8b0a99bffff0fe6dff524ae8fdcd7b6367427bf31f29e46fb274a110f17081765ae547f7e5b4eec0cfde775bba90eef139f6c69571eb16de4e1795089a31ec5f"

RPROVIDES:${PN} += "cross-x86_64-gcc13 \
cross-x86_64-gcc13(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
cross-x86_64-binutils \
libstdc++6-devel-gcc13 \
update-alternatives"

inherit rpm
