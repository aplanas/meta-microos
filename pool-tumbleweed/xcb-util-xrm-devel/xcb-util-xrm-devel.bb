SUMMARY = "Development files for the XCB X Resource Manager utility module"
DESCRIPTION = "The XCB util modules provides a number of libraries which sit on top \
of libxcb, the core X protocol library, and some of the extension \
libraries. \
 \
This package contains the development headers for the library found \
in libxcb-xrm0."
LICENSE = "MIT"

PV = "1.3"

RPM_NAME = "xcb-util-xrm-devel-1.3-1.10.aarch64.rpm"
RPM_HASH = "89448e008dc195b2c8e1b53dc811af17b897f5e17656ccd8569cbc18d4408aeccaa7424b1beeaf75164bac8ab07d7596509f96b47564457ef854e533a7fe3320"

RPROVIDES:${PN} += "pkgconfig(xcb-xrm) \
xcb-util-xrm-devel \
xcb-util-xrm-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxcb-xrm0 \
pkgconfig(xcb) \
pkgconfig(xcb-aux)"

inherit rpm
