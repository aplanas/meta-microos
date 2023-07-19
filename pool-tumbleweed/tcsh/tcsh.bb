SUMMARY = "The C SHell"
DESCRIPTION = "Tcsh is an enhanced, but completely compatible, version of the Berkeley \
UNIX C shell, csh(1). It is a command language interpreter usable as an \
interactive login shell and a shell script command processor. It \
includes a command-line editor, programmable word completion, spelling \
correction, a history mechanism, job control, and a C-like syntax."
LICENSE = "BSD-3-Clause"

PV = "6.24.10"

RPM_NAME = "tcsh-6.24.10-2.1.aarch64.rpm"
RPM_HASH = "67a05b57c24f4d8ce634c1f62cd319827c8ba536c0751acc98420285c7a4d2d7cd8a75f5c84bed22982fe625f1a51adc2f9915b2a4862d48facf5d2c3126b8a4"

RPROVIDES:${PN} += "/usr/bin/csh \
config-tcsh \
tcsh"

RDEPENDS:${PN} += "gawk \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libtinfo.so.6 \
textutils"

inherit rpm
