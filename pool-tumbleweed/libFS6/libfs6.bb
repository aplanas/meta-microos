SUMMARY = "X Font Service client library"
DESCRIPTION = "This library is used by clients of X Font Servers (xfs), such as \
xfsinfo, xfslsfonts, and the X servers themselves."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "libFS6-1.0.9-1.3.aarch64.rpm"
RPM_HASH = "d08cb87e3da1811a1ed2939ea1ed59def69704bd51f2fbf190159ff7b10e1af36cce54528b0d4ca443f364a4c66da4f4407d03228ea676fd6ba5765d13af7bdd"

RPROVIDES:${PN} += "libFS.so.6 \
libFS6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
