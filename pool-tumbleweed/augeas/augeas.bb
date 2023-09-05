SUMMARY = "An utility for changing configuration files"
DESCRIPTION = "An utility for programmatically editing configuration files. Augeas \
parses configuration files into a tree structure. \
 \
The transformation works very hard to preserve comments and formatting \
details. It is controlled by ``lens'' definitions that describe the \
file format and the transformation into a tree."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.1"

RPM_NAME = "augeas-1.14.1-1.1.aarch64.rpm"
RPM_HASH = "49ececbd4fb9c2ff7bf26bb8b210f0e7ea649f57611d6109bb627bc59b14c003c2a4e139ec7887942cf972db90d533105fd03db8de53d2d860523a321c9effc8"

RPROVIDES:${PN} += "augeas"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaugeas.so.0 \
libc.so.6 \
libfa.so.1 \
libgcc-s.so.1 \
libreadline.so.8"

inherit rpm
