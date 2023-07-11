SUMMARY = "GNU Linear Programming Kit"
DESCRIPTION = "The GLPK package is intended for solving large-scale linear \
programming, mixed integer programming, and other related problems. It \
is a set of routines written in ANSI C and organized in the form of a \
callable library."
LICENSE = "GPL-3.0-only"

PV = "5.0"

RPM_NAME = "libglpk40-5.0-1.14.aarch64.rpm"
RPM_HASH = "7ee41113bceaa57e3e73a3eba9c0cc8d4bcaa685af4b41788c9cb550520188d8765be9c207009189b057632a7ac8909cb3993258bffcef0b1d415548cf4e3376"

RPROVIDES:${PN} += "libglpk.so.40 \
libglpk40"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libltdl.so.7 \
libm.so.6"

inherit rpm
