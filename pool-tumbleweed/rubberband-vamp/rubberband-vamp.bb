SUMMARY = "Vamp plugins for librubberband"
DESCRIPTION = "This package contains the following Vamp plugins: \
 * increments (Output Increments): Output time increment for each \
   input step \
 * aggregate_increments (Accumulated Output Increments): Accumulated \
   output time increments \
 * divergence (Divergence from Linear): Difference between actual \
   output time and the output time for a theoretical linear stretch \
 * phaseresetdf (Phase Reset Detection Function): Curve whose peaks \
   are used to identify transients for phase reset points \
 * smoothedphaseresetdf (Smoothed Phase Reset Detection Function): \
   Phase reset curve smoothed for peak picking \
 * phaseresetpoints (Phase Reset Points): Points estimated as \
   transients at which phase reset occurs \
 * timesyncpoints (Time Sync Points): Salient points which stretcher \
   aims to place with strictly correct timing"
LICENSE = "GPL-2.0-or-later"

PV = "3.1.0"

RPM_NAME = "rubberband-vamp-3.1.0-1.4.aarch64.rpm"
RPM_HASH = "41c01c06e7ab61e0115db936ed755c8e7c774668bb3e9723d0f59cf6cb12584339caa286d1fdca62bf4e8aca4fa21c9017081c498bbd7f08897df85518f0f4e7"

RPROVIDES:${PN} += "rubberband-vamp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3.so.3 \
libgcc-s.so.1 \
libm.so.6 \
librubberband2 \
libstdc++.so.6 \
libvamp-sdk.so.2"

inherit rpm
