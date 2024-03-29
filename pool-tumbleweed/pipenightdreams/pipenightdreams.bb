SUMMARY = "Puzzle game similar to PipeMania"
DESCRIPTION = "PipeNightDreams is a PipeDream style game. The objetive of the game \
is to carry liquid from some point to the exit using different kinds \
of pipes. On each level there is a minimum number of required pipes \
that should be at least reached for it to be completed. \
 \
The score is increased by using as many pipes as possible an by \
collecting various bonus tokens making the liquid pass through their \
pipes. There are also life bonus and, hopefully soon, 'freeze tokens'."
LICENSE = "GPL-2.0+"

PV = "0.10.0"

RPM_NAME = "pipenightdreams-0.10.0-1.27.aarch64.rpm"
RPM_HASH = "eba93c2d29873a2589b7d9644ea5297e2fed0e58d8e139b95017bec6ee9d95ce1c3a481c2e0fa88dc19061c1648bbfb4dd79be4050c2c4345c061a60d5e81036"

RPROVIDES:${PN} += "pipenightdreams"

RDEPENDS:${PN} += "libSDL-1.2.so.0 \
libSDL-image-1.2.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
