SUMMARY = "A software package for large-scale nonlinear optimization methods"
DESCRIPTION = "Ipopt (Interior Point OPTimizer, pronounced eye-pea-Opt) is a software \
package for large-scale nonlinear optimization."
LICENSE = "EPL-2.0"

PV = "3.14.12"

RPM_NAME = "libipopt3-3.14.12-1.1.aarch64.rpm"
RPM_HASH = "34feea648b7cf308bc9c3fa646eecacd240b06a54bd8c86d4b481b0966d80a03bcec93330d049bb0ebd727e1e2e1101110eddd18abc627d2f8e829205726a2e6"

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
