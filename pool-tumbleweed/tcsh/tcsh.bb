SUMMARY = "The C SHell"
DESCRIPTION = "Tcsh is an enhanced, but completely compatible, version of the Berkeley \
UNIX C shell, csh(1). It is a command language interpreter usable as an \
interactive login shell and a shell script command processor. It \
includes a command-line editor, programmable word completion, spelling \
correction, a history mechanism, job control, and a C-like syntax."
LICENSE = "BSD-3-Clause"

PV = "6.24.10"

RPM_NAME = "tcsh-6.24.10-1.2.aarch64.rpm"
RPM_HASH = "edfb7d8925e148d57b685def0c80cbc15ae5fa844f8f72fb0aea8b56695de10d25b42f67e04e543c91b6368efc59d3c38820ff7d712fafe59f2f0fc59b7053a7"

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
