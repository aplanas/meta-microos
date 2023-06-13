SUMMARY = "A software package for large-scale nonlinear optimization methods"
DESCRIPTION = "Ipopt (Interior Point OPTimizer, pronounced eye-pea-Opt) is a software \
package for large-scale nonlinear optimization."
LICENSE = "EPL-2.0"

PV = "3.14.12"

RPM_NAME = "libipopt3-3.14.12-1.1.aarch64.rpm"
RPM_HASH = "34feea648b7cf308bc9c3fa646eecacd240b06a54bd8c86d4b481b0966d80a03bcec93330d049bb0ebd727e1e2e1101110eddd18abc627d2f8e829205726a2e6"

RPROVIDES:${PN} += "libipopt.so.3()(64bit) \
libipopt3 \
libipopt3(aarch-64) \
libsipopt.so.3()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libblas.so.3()(64bit) \
libc.so.6()(64bit) \
libdmumps_seq.so.5.3.5()(64bit) \
libgcc_s.so.1()(64bit) \
liblapack.so.3()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
