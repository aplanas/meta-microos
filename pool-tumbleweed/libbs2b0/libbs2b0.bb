SUMMARY = "The Bauer stereophonic-to-binaural DSP library"
DESCRIPTION = "The Bauer stereophonic-to-binaural DSP (bs2b) library and plugins is designed to \
improve headphone listening of stereo audio records. Recommended for headphone \
prolonged listening to disable superstereo fatigue without essential \
distortions."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "libbs2b0-3.1.0-13.3.aarch64.rpm"
RPM_HASH = "72e7ff775fc12b9bf4db184cc517cc987c9bf2fbe2f6ec6d082fd4a385d702966de5b99938ec2c133a38c036a2a8155b5402fa406fa54daf8313f908ddddc3b7"

RPROVIDES:${PN} += "libbs2b.so.0 \
libbs2b0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
