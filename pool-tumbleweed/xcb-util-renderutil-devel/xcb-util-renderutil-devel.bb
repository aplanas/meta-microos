SUMMARY = "Development files for the XCB Render utility module"
DESCRIPTION = "The XCB util modules provide a number of libraries which sit on top \
of libxcb, the core X protocol library, and some of the extension \
libraries. \
 \
This package contains the development headers for the library found \
in libxcb-render-util0."
LICENSE = "MIT"

PV = "0.3.10"

RPM_NAME = "xcb-util-renderutil-devel-0.3.10-1.2.aarch64.rpm"
RPM_HASH = "1cdb0dd1468087c02ac4386f0527a5fe1f16d6126ffb43a733444ea2ee949fba91957da646668e82d7f02d011106f1513ca294439bd8c214ade9de1c6c8b2641"

RPROVIDES:${PN} += "pkgconfig-xcb-renderutil \
xcb-util-renderutil-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxcb-render-util0 \
pkgconfig-xcb \
pkgconfig-xcb-render"

inherit rpm
