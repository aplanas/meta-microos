SUMMARY = "FDTD finite-difference time-domain solver library"
DESCRIPTION = "Meep (or MEEP) is a free finite-difference time-domain (FDTD) \
simulation software package developed at MIT to model electromagnetic \
systems."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.0"

RPM_NAME = "libmeep31-1.26.0-1.4.aarch64.rpm"
RPM_HASH = "3186ef3ae952d082242d601fc1b201dce9db3fc97d590f5b6430fce9536f060bd1b0baf3a1334833938f440ead1af88f74854ae769208fe1a90e8a2a1cd05a91"

RPROVIDES:${PN} += "libmeep.so.31 \
libmeep31"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libctlgeom.so.7 \
libfftw3.so.3 \
libgcc-s.so.1 \
libgomp.so.1 \
libgsl.so.27 \
libgslcblas.so.0 \
libharminv.so.3 \
libhdf5.so.200 \
liblapack.so.3 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
