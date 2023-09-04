SUMMARY = "Dockerfile Linter JavaScript API"
DESCRIPTION = "A smarter Dockerfile linter that helps you build best practice Docker images."
LICENSE = "GPL-3.0-or-later"

PV = "2.12.0"

RPM_NAME = "hadolint-2.12.0-1.14.aarch64.rpm"
RPM_HASH = "4aaad78fa7be1d3ee1eaddf048dad6ad0ed8105b639323e81e002805a499fbe6d48853ae221d498c1693cec57062f12a2e6ac2521b09f3a6c3c3ff60262d2e3a"

RPROVIDES:${PN} += "hadolint"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
