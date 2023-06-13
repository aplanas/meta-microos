SUMMARY = "Library for interfacing Python with VapourSynth"
DESCRIPTION = "VSScript (or libvapoursynth-script) is a library for interfacing Python \
with VapourSynth."
LICENSE = "LGPL-2.1-only"

PV = "62"

RPM_NAME = "libvapoursynth-script0-62-1.2.aarch64.rpm"
RPM_HASH = "c21a0053fe9aede5ac11687f45996195bdbb510760b2961e25283f6ec3bd92bed52158667f08f3e829b4b58202f4019138858491bc264f96ebda550fb6e4104a"

RPROVIDES:${PN} += "libvapoursynth-script.so.0()(64bit) \
libvapoursynth-script0 \
libvapoursynth-script0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libpython3.10.so.1.0()(64bit) \
libstdc++.so.6()(64bit) \
python3-vapoursynth"

inherit rpm
