SUMMARY = "Shared Libraries for coin-or-Cgl"
DESCRIPTION = "The COIN-OR Cut Generation Library (Cgl) is a collection of cut generators \
that can be used with other COIN-OR packages that make use of cuts, such as, \
among others, the linear solver Clp or the mixed integer linear programming \
solvers Cbc or BCP"
LICENSE = "EPL-2.0"

PV = "0.60.6"

RPM_NAME = "libCgl1-0.60.6-1.4.aarch64.rpm"
RPM_HASH = "c37516587e3a81a4b93aca4abe69036a6d9ec4328e3b2fcfe940d3df5ec2105c72fa9e7096245d6e87708e4b2e89d546f36a0f0ba9ed00f159e0a4b1cfd02311"

RPROVIDES:${PN} += "libCgl.so.1 \
libCgl1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libClp.so.1 \
libCoinUtils.so.3 \
libOsi.so.1 \
libOsiClp.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
