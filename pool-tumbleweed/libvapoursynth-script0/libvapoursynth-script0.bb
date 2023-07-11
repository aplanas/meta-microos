SUMMARY = "Library for interfacing Python with VapourSynth"
DESCRIPTION = "VSScript (or libvapoursynth-script) is a library for interfacing Python \
with VapourSynth."
LICENSE = "LGPL-2.1-only"

PV = "63"

RPM_NAME = "libvapoursynth-script0-63-1.1.aarch64.rpm"
RPM_HASH = "1618046a519317d1dde313d29fa38f6c1a706175eb38c85569cbb266504e2f12895b1b65939bb36c8a55deb1a84c3c93b4e0b2e6900857cb23b27510d53143d0"

RPROVIDES:${PN} += "libvapoursynth-script.so.0 \
libvapoursynth-script0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.11.so.1.0 \
libstdc++.so.6 \
python3-vapoursynth"

inherit rpm
