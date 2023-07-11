SUMMARY = "An utility for changing configuration files"
DESCRIPTION = "An utility for programmatically editing configuration files. Augeas \
parses configuration files into a tree structure. \
 \
The transformation works very hard to preserve comments and formatting \
details. It is controlled by ``lens'' definitions that describe the \
file format and the transformation into a tree."
LICENSE = "LGPL-2.1-or-later"

PV = "1.13.0"

RPM_NAME = "augeas-1.13.0-2.2.aarch64.rpm"
RPM_HASH = "fc37ad583d15c5ffe0cba42ef4a00c56ef7bb289ad1209f928903a86f028a62b257983562924295044da0ab340448abbc2cb150c18aa277168d98e79bc79b14b"

RPROVIDES:${PN} += "augeas"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaugeas.so.0 \
libc.so.6 \
libfa.so.1 \
libgcc-s.so.1 \
libreadline.so.8"

inherit rpm
