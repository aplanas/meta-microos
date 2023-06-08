SUMMARY = "Automatically restart SSH sessions and tunnels"
DESCRIPTION = "Autossh is a program to start a copy of ssh and monitor it, restarting \
it as necessary should it die or stop passing traffic. The idea and \
the mechanism are from rstunnel (Reliable SSH Tunnel), but implemented \
in C. The author's view is that it is not as fiddly as rstunnel to get \
to work. Connection monitoring using a loop of port forwardings. Backs \
off on rate of connection attempts when experiencing rapid failures \
such as connection refused."
LICENSE = "BSD-3-Clause"

PV = "1.4g"

RPM_NAME = "autossh-1.4g-2.13.aarch64.rpm"
RPM_HASH = "7c88d1c10a4ab341272eeec704f52554ff5ac582fe1d27e43d890ad86a1ddf16e4b06087c0992a1549c42c30dc64fe3f6640e265317719ec38ba30a17dfd49a1"

RPROVIDES:${PN} += "autossh autossh(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) openssh"

inherit rpm
