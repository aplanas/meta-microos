SUMMARY = "Development files for XRootD clients"
DESCRIPTION = "The XROOTD project gives access to data repositories. \
The typical usage is to give access to file-based ones. \
 \
This package contains header files and development libraries \
for XRootD client development"
LICENSE = "LGPL-3.0-or-later"

PV = "5.6.1"

RPM_NAME = "xrootd-client-devel-5.6.1-1.1.aarch64.rpm"
RPM_HASH = "7c12088827d723df2dd3f6154e4ed53df68723a1e79f46ab17e79c35085c230eff838c8f3e87fb918cf04e14e515250a044fa9ddd1271512b41a2e77ff0a08bb"

RPROVIDES:${PN} += "xrootd-cl-devel \
xrootd-client-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libXrdCrypto.so.2 \
libXrdUtils.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
xrootd-client-libs \
xrootd-libs-devel"

inherit rpm
