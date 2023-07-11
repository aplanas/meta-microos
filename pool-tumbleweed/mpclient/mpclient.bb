SUMMARY = "A minimalist command line interface to MPD"
DESCRIPTION = "A client for MPD, the Music Player Daemon. mpc connects to a MPD \
running on a machine via a network. Accepts input on standard input, \
so can be easily used in scripts."
LICENSE = "GPL-2.0-or-later"

PV = "0.34"

RPM_NAME = "mpclient-0.34-1.9.aarch64.rpm"
RPM_HASH = "d6be30dc3e439e3a2000bb6427ba992b36f20892ed32776dcbf749168f1477e62e91246ef59cfc6d1c8acbc2b389be5a81e1e9bf74b81345c2b13f2be72732a1"

RPROVIDES:${PN} += "config-mpclient \
mpclient"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmpdclient.so.2"

inherit rpm
