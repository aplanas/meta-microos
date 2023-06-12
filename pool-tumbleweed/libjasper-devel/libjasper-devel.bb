SUMMARY = "Development files for libjasper, a JPEG-2000 library"
DESCRIPTION = "This package contains libjasper, a library implementing the JPEG-2000 \
image compression standard Part 1."
LICENSE = "JasPer-2.0"

PV = "4.0.0"

RPM_NAME = "libjasper-devel-4.0.0-1.3.aarch64.rpm"
RPM_HASH = "fedfa9376d9900620536c5f36a7ffe34ce26fc9cbcb9085af0058f0751500f8cc3c519b23aaae3cb4842dae331854e462364e6a36150e2486579940ae9ae967f"

RPROVIDES:${PN} += "libjasper-devel \
libjasper-devel(aarch-64) \
pkgconfig(jasper)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjasper7 \
libjpeg-devel \
pkgconfig(libjpeg)"

inherit rpm
