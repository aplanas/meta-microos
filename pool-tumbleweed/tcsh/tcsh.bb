SUMMARY = "The C SHell"
DESCRIPTION = "Tcsh is an enhanced, but completely compatible, version of the Berkeley \
UNIX C shell, csh(1). It is a command language interpreter usable as an \
interactive login shell and a shell script command processor. It \
includes a command-line editor, programmable word completion, spelling \
correction, a history mechanism, job control, and a C-like syntax."
LICENSE = "BSD-3-Clause"

PV = "6.24.10"

RPM_NAME = "tcsh-6.24.10-3.1.aarch64.rpm"
RPM_HASH = "b8a05b6dd059c44484dc033ac54c1f711c4f5a9f99a7161845ac7a30019c18a1e8ea797bdbef04a66f8dfaadb720fe1688ed9a4dc5fa678c2fe934a7c91977d1"

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
