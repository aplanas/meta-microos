SUMMARY = "Development libraries for VFlib3"
DESCRIPTION = "Development headers and libraries for VFlib3"
LICENSE = "LGPL-2.1-or-later"

PV = "3.7.2"

RPM_NAME = "VFlib3-devel-3.7.2-1.9.aarch64.rpm"
RPM_HASH = "524921faa84cf789622e08e4bc959a2720d43340832a86a3a439c6493a225d95454d6e2faefd3dd89d78793f1ce15cc91e03a7da72246840001d4484718b6a30"

RPROVIDES:${PN} += "VFlib3-devel \
VFlib3-devel(aarch-64)"
RDEPENDS:${PN} += "libVFlib3-10 \
pkgconfig(freetype2) \
pkgconfig(kpathsea)"

inherit rpm
