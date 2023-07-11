SUMMARY = "Dockerfile Linter JavaScript API"
DESCRIPTION = "A smarter Dockerfile linter that helps you build best practice Docker images."
LICENSE = "GPL-3.0-or-later"

PV = "2.12.0"

RPM_NAME = "hadolint-2.12.0-1.8.aarch64.rpm"
RPM_HASH = "b0ae9890239dd9ef8b35c4dff5f579513298f91444cc0c06bfb059315b1b74d2d5df607799b5865bd310ea01244c63ca2b472442ac007e93c40958b747022efc"

RPROVIDES:${PN} += "hadolint"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
