SUMMARY = "Development files for the X11 Composite extension library"
DESCRIPTION = "The composite extension provides several related mechanisms: \
- Per-hierarchy storage: The rendering of an entire hierarchy of \
  windows is redirected to off-screen storage. \
- Automatic shadow update: When a hierarchy is rendered off-screen, \
  the X server provides an automatic mechanism for presenting those \
  contents within the parent window. \
- Composite overlay window: provides compositing managers with a \
  surface on which to draw without interference. \
- Parent window clipping: modifies the semantics of parent window \
  clipping in the presence of manual redirected children. \
 \
This package contains the development headers for the library found \
in libXcomposite1."
LICENSE = "MIT"

PV = "0.4.6"

RPM_NAME = "libXcomposite-devel-0.4.6-1.2.aarch64.rpm"
RPM_HASH = "63e9387f212b7ca0d1d5974891ee3dd07ebfe1b9a1fd10a164e94807989959b002b6d5a014275e403bb439e15d59ceb4d285f31160ef60a0a307f9772e41d028"

RPROVIDES:${PN} += "libXcomposite-devel \
libXcomposite-devel(aarch-64) \
pkgconfig(xcomposite)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXcomposite1 \
pkgconfig(compositeproto) \
pkgconfig(x11) \
pkgconfig(xfixes) \
pkgconfig(xproto)"

inherit rpm
