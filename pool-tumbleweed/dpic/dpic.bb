SUMMARY = "Pic language processor"
DESCRIPTION = "Pic language processor for LaTeX documents or web sites."
LICENSE = "BSD-2-Clause & CC-BY-3.0"

PV = "2023.02.01"

RPM_NAME = "dpic-2023.02.01-1.4.aarch64.rpm"
RPM_HASH = "3ac2fda2ae7db991c2c716a5dbbb22c213a93492b4dda1b2f0ab34f3ebc28472bd7bda2f9838e2c8e2b78c9098f327b45c6f924b427550a199baefb9b0d4c839"

RPROVIDES:${PN} += "dpic"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
