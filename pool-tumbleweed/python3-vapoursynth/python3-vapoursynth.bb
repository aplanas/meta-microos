SUMMARY = "Python interface for VapourSynth"
DESCRIPTION = "Python interface for VapourSynth/VSSCript."
LICENSE = "LGPL-2.1-only"

PV = "62"

RPM_NAME = "python3-vapoursynth-62-1.2.aarch64.rpm"
RPM_HASH = "0771b61347f92729582e7f9ae6c3c0e0e3b7e00eb043da828b0611cadb8c85d6391331b0e7363eaef672e7d6c1bfb1829593da5ec9732bc97779d43bba911508"

RPROVIDES:${PN} += "python3-vapoursynth"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libvapoursynth-62.so \
python-abi"

inherit rpm
