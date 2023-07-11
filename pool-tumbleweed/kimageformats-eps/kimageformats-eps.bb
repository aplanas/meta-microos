SUMMARY = "EPS image format plugin for Qt"
DESCRIPTION = "This plugin provides support for the EPS document format for QtGui. As \
it invokes ghostscript for conversion, it should only be used in trusted \
environments."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kimageformats-eps-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "78efa2f6cea5c728b8ced0bfcab7b8cbb80b8b0d8f37993b105ca94d73b6f62d1cbb8b6d95c41871b9fe432ca27727b14ebe725b2165829c32033887fe5fc6af"

RPROVIDES:${PN} += "kimageformats-eps"

RDEPENDS:${PN} += "ghostscript \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
