SUMMARY = "The C SHell"
DESCRIPTION = "Tcsh is an enhanced, but completely compatible, version of the Berkeley \
UNIX C shell, csh(1). It is a command language interpreter usable as an \
interactive login shell and a shell script command processor. It \
includes a command-line editor, programmable word completion, spelling \
correction, a history mechanism, job control, and a C-like syntax."
LICENSE = "BSD-3-Clause"

PV = "6.24.10"

RPM_NAME = "tcsh-6.24.10-1.1.aarch64.rpm"
RPM_HASH = "42f0761b910be5ead2e2184cf4ab4c38bdd16640da23caa375ec736a5f8ce3ea7a93e8c0aa8718174c401f411dbe813542aca842c8806155cca79e1f6f460030"

RPROVIDES:${PN} += "/bin/csh \
config(tcsh) \
tcsh \
tcsh(aarch-64)"
RDEPENDS:${PN} += "gawk \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypt.so.1()(64bit) \
libcrypt.so.1(XCRYPT_2.0)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
textutils"

inherit rpm
