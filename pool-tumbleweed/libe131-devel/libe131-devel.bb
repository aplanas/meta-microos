SUMMARY = "Development files for libe131"
DESCRIPTION = "The libe131-devel package contains libraries and header files for \
developing applications that use libe131."
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "libe131-devel-1.4.0-1.10.aarch64.rpm"
RPM_HASH = "747d8d190fdc5de27f65fc2f992bfee7050ca9b2f850ced0838cfd3229219556c93236f4d338f1f110745acdf556e7e36df85162e69ac8fbffcc5b66eb83639e"

RPROVIDES:${PN} += "libe131-devel \
libe131-devel(aarch-64) \
pkgconfig(libe131)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libe131-1"

inherit rpm
