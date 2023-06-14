SUMMARY = "An embeddable Javascript interpreter"
DESCRIPTION = "MuJS is a lightweight Javascript interpreter designed for embedding in other software to extend them with scripting capabilities."
LICENSE = "AGPL-3.0-or-later"

PV = "1.3.3"

RPM_NAME = "mujs-1.3.3-1.1.aarch64.rpm"
RPM_HASH = "45825842d9dae3992369284b986021be2314bb6c9e1fb90daea774840eacf7da5ab835c87e127007969a2740d88cd9dafbf1aa79f9b76bc55adf2de96e1d2f2e"

RPROVIDES:${PN} += "mujs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libreadline.so.8"

inherit rpm
