SUMMARY = "An utility for changing configuration files"
DESCRIPTION = "An utility for programmatically editing configuration files. Augeas \
parses configuration files into a tree structure. \
 \
The transformation works very hard to preserve comments and formatting \
details. It is controlled by ``lens'' definitions that describe the \
file format and the transformation into a tree."
LICENSE = "LGPL-2.1-or-later"

PV = "1.13.0"

RPM_NAME = "augeas-1.13.0-2.1.aarch64.rpm"
RPM_HASH = "a163740722aa383ee0069e31cc36f8a6d340be936181c74377590e709101b8c57042b7743f60ecf675b68265a0dc467c6141a2c4bc896afb0c5535adccf1cb11"

RPROVIDES:${PN} += "augeas \
augeas(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libaugeas.so.0()(64bit) \
libc.so.6()(64bit) \
libfa.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libreadline.so.8()(64bit)"

inherit rpm
