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

RPM_NAME = "autossh-1.4g-2.14.aarch64.rpm"
RPM_HASH = "f13245aabe7b7d77a54353cd4c8fb3c56cbfcf91be3610e6a4dcb611f9c8551eaf7809f69a79b279a13d3b7d40a18c46e3a0314a753f468559fe3be6b32cd3ae"

RPROVIDES:${PN} += "autossh"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
openssh"

inherit rpm
