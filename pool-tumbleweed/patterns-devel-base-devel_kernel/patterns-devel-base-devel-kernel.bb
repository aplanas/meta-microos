SUMMARY = "Linux Kernel Development"
DESCRIPTION = "Tools for Linux kernel development."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-devel-base-devel_kernel-20170319-11.2.aarch64.rpm"
RPM_HASH = "b43170a4e9320fb0cfaeddfccc794ee16ee29171e27c912e88645aa6457500d82699c0ad13d84ef337bc01093d7658824ead8392dd9f1526d51b07a27fe5f069"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
pattern-visible() \
patterns-devel-base-devel_kernel \
patterns-devel-base-devel_kernel(aarch-64)"
RDEPENDS:${PN} += "pattern()"

inherit rpm
