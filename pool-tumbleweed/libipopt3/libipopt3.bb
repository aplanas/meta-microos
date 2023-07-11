SUMMARY = "A software package for large-scale nonlinear optimization methods"
DESCRIPTION = "Ipopt (Interior Point OPTimizer, pronounced eye-pea-Opt) is a software \
package for large-scale nonlinear optimization."
LICENSE = "EPL-2.0"

PV = "3.14.12"

RPM_NAME = "libipopt3-3.14.12-1.2.aarch64.rpm"
RPM_HASH = "790dedb52ede8a90becbc613fda5df9673ef16f0ee046ca5450a5fe76830fe841623e997a75f3a077713556d86b7d5f94db74f17affc461f6726c4301d9add75"

RPROVIDES:${PN} += "libipopt.so.3 \
libipopt3 \
libsipopt.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
libdmumps-seq.so.5.3.5 \
libgcc-s.so.1 \
liblapack.so.3 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
