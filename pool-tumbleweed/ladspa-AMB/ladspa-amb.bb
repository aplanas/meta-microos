SUMMARY = "LADSPA Ambisonics plugin"
DESCRIPTION = "This package provides LADSPA (Linux Audio Developer's Simple Plug-in API) \
plugins to implement Ambisonics effects.  Included are: mono and stereo \
input panner, horizontal rotation, and square and hexagon horizontal decoders."
LICENSE = "GPL-2.0+"

PV = "0.6.1"

RPM_NAME = "ladspa-AMB-0.6.1-4.25.aarch64.rpm"
RPM_HASH = "1e81134b530f49da91fd0e49df82fac7b2469789151044c467a6f922eaed8bd3a16b7f59addbe402744b78c806da2cee4d26d7527e94093e47c2626e4097ab66"

RPROVIDES:${PN} += "ladspa-AMB"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
