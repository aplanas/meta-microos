SUMMARY = "Development files for VapourSynth"
DESCRIPTION = "Header files and pkg-config headers for VapourSynth."
LICENSE = "LGPL-2.1-only"

PV = "63"

RPM_NAME = "vapoursynth-devel-63-1.1.aarch64.rpm"
RPM_HASH = "8a9a79468d19f1a61047839e5d017240541832f6cb40d1bcf80d8fd9104c7211af6609febce5d0fa1cff1c40e1714ce8bf96783018fba5357af6e737e9526565"

RPROVIDES:${PN} += "pkgconfig-vapoursynth \
pkgconfig-vapoursynth-script \
vapoursynth-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvapoursynth-63 \
libvapoursynth-script0 \
pkgconfig-python-3.11 \
pkgconfig-vapoursynth \
pkgconfig-zimg"

inherit rpm
