SUMMARY = "MPC multiple-precision complex library development files"
DESCRIPTION = "MPC multiple-precision complex library development files."
LICENSE = "LGPL-3.0-or-later"

PV = "1.3.1"

RPM_NAME = "mpc-devel-1.3.1-1.3.aarch64.rpm"
RPM_HASH = "a7a1eac19fa9743dae9c391b36ec7dee79502b3f5444553f1538a116b30c59a377b6c5a3284375881c8c88940820f4a8700d28149f98cf6be5f50add7ef3f801"

RPROVIDES:${PN} += "mpc-devel \
mpc-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
libmpc3 \
pkgconfig(gmp) \
pkgconfig(mpfr)"

inherit rpm
