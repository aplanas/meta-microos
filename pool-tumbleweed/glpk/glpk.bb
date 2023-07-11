SUMMARY = "GNU Linear Programming Kit"
DESCRIPTION = "The GLPK package is intended for solving large-scale linear \
programming, mixed integer programming, and other related problems. It \
is a set of routines written in ANSI C and organized in the form of a \
callable library."
LICENSE = "GPL-3.0-only"

PV = "5.0"

RPM_NAME = "glpk-5.0-1.14.aarch64.rpm"
RPM_HASH = "91d922c9b6202b8d0fcaf3c54c19494f4e928633516c92ffb22588f9e795dc48a2b8cf703d92fb39d926fb1da9b61ec2454243e8c618afa6b22eb9d1e20708ab"

RPROVIDES:${PN} += "glpk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglpk.so.40 \
libm.so.6"

inherit rpm
