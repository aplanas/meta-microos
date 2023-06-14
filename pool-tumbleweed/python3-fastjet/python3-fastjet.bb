SUMMARY = "Python3 bindings for fastjet"
DESCRIPTION = "FastJet is a software package for jet finding in pp and e+e- \
collisions. \
 \
This package provides python3 bindings for fastjet."
LICENSE = "GPL-2.0-or-later"

PV = "3.4.0"

RPM_NAME = "python3-fastjet-3.4.0-2.8.aarch64.rpm"
RPM_HASH = "dbb45ded039383390b993391cd672ef91a05611fcdc5e742fb094be935d86356e68f05ff43aa55a75efa2dbe18cbfbd6495e310d03dac4d5f9c37dd26b2efca2"

RPROVIDES:${PN} += "python3-fastjet"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfastjet.so.0 \
libfastjettools.so.0 \
libgcc-s.so.1 \
libgmp.so.10 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
