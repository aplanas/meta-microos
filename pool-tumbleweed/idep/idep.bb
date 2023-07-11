SUMMARY = "Track the Dependencies in your C or C++ Code"
DESCRIPTION = "Idep can be used for checking the dependencies of C++ include files. It \
offers these features: \
 \
- Prints out hierarchy of include files \
 \
- Lists the class definitions that are found in each header file \
 \
- Detects cyclic dependencies in your include files \
 \
- Detects inclusions that could be pruned"
LICENSE = "GPL-2.0-or-later"

PV = "0.5"

RPM_NAME = "idep-0.5-164.13.aarch64.rpm"
RPM_HASH = "dc44fa806ad26ed7828d38a0486e3f59e1785c630f677ce51872869c33367502c86e0e19cddf6e0bad6404997b65e7ff6659b1ec152c4f2e18dce19cd37a5116"

RPROVIDES:${PN} += "idep"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
