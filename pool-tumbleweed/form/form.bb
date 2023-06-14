SUMMARY = "A Symbolic Manipulation System"
DESCRIPTION = "FORM is a Symbolic Manipulation System. It reads symbolic expressions from files \
and executes symbolic/algebraic transformations upon them. The answers are \
returned in a textual mathematical representation. As its landmark feature, the \
size of the considered expressions in FORM is only limited by the available \
disk space and not by the available RAM."
LICENSE = "GPL-3.0-or-later"

PV = "4.3.0"

RPM_NAME = "form-4.3.0-1.3.aarch64.rpm"
RPM_HASH = "587d4bda99f235ce153c8bdcbe11cbc567a4221dc952c8bbd8f47f8b7b30def36ac98556c21e2468ea4c7fb5d7947dca91a59237922d34936f2ab84d6c9d72bc"

RPROVIDES:${PN} += "form"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libm.so.6 \
libmpi.so.40 \
libstdc++.so.6 \
libz.so.1 \
openmpi4-libs"

inherit rpm
