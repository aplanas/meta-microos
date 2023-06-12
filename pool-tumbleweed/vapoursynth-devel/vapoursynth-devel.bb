SUMMARY = "Development files for VapourSynth"
DESCRIPTION = "Header files and pkg-config headers for VapourSynth."
LICENSE = "LGPL-2.1-only"

PV = "62"

RPM_NAME = "vapoursynth-devel-62-1.2.aarch64.rpm"
RPM_HASH = "e4a82800a695e6583a4855192b1f23c28e25f2ca875a4c6af0d1f58a8b21d3d937176eaca8cffcf326f56ef6390feda56ba4e5016807003a5afb22c501948c00"

RPROVIDES:${PN} += "pkgconfig(vapoursynth) \
pkgconfig(vapoursynth-script) \
vapoursynth-devel \
vapoursynth-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvapoursynth-62 \
libvapoursynth-script0 \
pkgconfig(python-3.10) \
pkgconfig(vapoursynth) \
pkgconfig(zimg)"

inherit rpm
