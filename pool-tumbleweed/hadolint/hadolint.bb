SUMMARY = "Dockerfile Linter JavaScript API"
DESCRIPTION = "A smarter Dockerfile linter that helps you build best practice Docker images."
LICENSE = "GPL-3.0-or-later"

PV = "2.12.0"

RPM_NAME = "hadolint-2.12.0-1.15.aarch64.rpm"
RPM_HASH = "34ce4e96a0380c742c475101bd58f9997a7f0c5255b8474f4bb81d99abf41d8500e625d0348ead1e69a3d275668ea8bf4e04e475feb4c8d97f85083c5f357130"

RPROVIDES:${PN} += "hadolint"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
