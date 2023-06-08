SUMMARY = "Two players, two castles, and a hill in between"
DESCRIPTION = "Ballerburg is a castle combat game. Two players (which can be human or \
computer-controlled) try to destroy the opponent's castle with their cannons. \
 \
Eckhard Kruse's original Ballerburg from 1987 ported to SDL."
LICENSE = "GPL-3.0-only"

PV = "1.2.1"

RPM_NAME = "ballerburg-1.2.1-1.4.aarch64.rpm"
RPM_HASH = "08343294095bd8e8f574b789150c2d86b47159e4a084b903152601ea1dd7ff8fd1f9238aa3126491c4e4a3bbe01001c711fd215abc5b47cdbd32765261cdee93"

RPROVIDES:${PN} += "application() application(ballerburg.desktop) ballerburg ballerburg(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libSDL2-2.0.so.0()(64bit) libSDL2-2.0.so.0(SUSE_2.24.0)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
