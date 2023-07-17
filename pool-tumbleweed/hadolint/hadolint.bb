SUMMARY = "Dockerfile Linter JavaScript API"
DESCRIPTION = "A smarter Dockerfile linter that helps you build best practice Docker images."
LICENSE = "GPL-3.0-or-later"

PV = "2.12.0"

RPM_NAME = "hadolint-2.12.0-1.9.aarch64.rpm"
RPM_HASH = "e549924f7b9db2045e7c58f8d16dfff0e5c41b8836680a01ec5849eb2a8356742d1943fbd09230a5c5727a3ab5453e504fee37dfc98b3cd72ce25df145244bcd"

RPROVIDES:${PN} += "hadolint"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
