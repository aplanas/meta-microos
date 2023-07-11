SUMMARY = "Package provides recommended R-survival"
DESCRIPTION = "This packages provides R-survival, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "3.5.5"

RPM_NAME = "R-survival-3.5.5-46.1.aarch64.rpm"
RPM_HASH = "839977ecd667b243293e8b334cb4a88b29e07b397a8b606fb7eba4d148caec3a60f6f8bfffa83c36289f98ca8af65b4e60d864841d1fc2e59d02a21476f5ec7f"

RPROVIDES:${PN} += "R-survival"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1 \
libR.so \
libc.so.6"

inherit rpm
