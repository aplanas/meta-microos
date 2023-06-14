SUMMARY = "Development files for duktape"
DESCRIPTION = "Embeddable Javascript engine. \
 \
This package contains header files and libraries needed to develop \
application that use duktape."
LICENSE = "MIT"

PV = "2.7.0"

RPM_NAME = "duktape-devel-2.7.0-1.1.aarch64.rpm"
RPM_HASH = "b2041e1c4e4829ceaeff372d9ade4456944fc51679036305535af73498cf0879a6f6b83d9b2dfb2ccc22db3f7eaa1e17483c25b7ccfa8c0817afeaa9cac41342"

RPROVIDES:${PN} += "duktape-devel \
pkgconfig-duktape"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libduktape207"

inherit rpm
