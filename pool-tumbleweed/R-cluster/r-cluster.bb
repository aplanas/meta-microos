SUMMARY = "Package provides recommended R-cluster"
DESCRIPTION = "This packages provides R-cluster, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "2.1.4"

RPM_NAME = "R-cluster-2.1.4-46.1.aarch64.rpm"
RPM_HASH = "49ee6be36d73ec4d4256d3108e4aab9328f0c9f03f941881f2cc5a5a25f7800b4d6eee90d9500adbc6bdc7279904668bd9db93a42f65d3d3c4b1dd2aa48e44d4"

RPROVIDES:${PN} += "R-cluster"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1 \
libR.so \
libc.so.6 \
libm.so.6"

inherit rpm
