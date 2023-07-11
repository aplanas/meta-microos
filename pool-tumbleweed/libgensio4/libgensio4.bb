SUMMARY = "Library to abstract stream and packet I/O"
DESCRIPTION = "This is gensio (pronounced gen'-see-oh), a framework for giving a \
consistent view of various stream (and packet) I/O types. You \
create a gensio object (or a gensio), and you can use that gensio \
without having to know too much about what is going on underneath. \
You can stack gensio on top of another one to add protocol \
funcionality. For instance, you can create a TCP gensio, stack SSL \
on top of that, and stack Telnet on top of that. It supports a \
number of network I/O and serial ports. gensios that stack on \
other gensios are called filters."
LICENSE = "Apache-2.0 & GPL-2.0-only & LGPL-2.1-only"

PV = "2.6.1"

RPM_NAME = "libgensio4-2.6.1-1.6.aarch64.rpm"
RPM_HASH = "58c2683df85c615e16b206ecb93eee6b7dc4cc7eecbcf21d1c743f77205ccfb2b4993121a14fa03a67c27a8b986717884470e45955c3a1a7324b94e1075e38be"

RPROVIDES:${PN} += "libgensio-afskmdm.so \
libgensio-ax25.so \
libgensio-certauth.so \
libgensio-conacc.so \
libgensio-dummy.so \
libgensio-echo.so \
libgensio-file.so \
libgensio-ipmisol.so \
libgensio-keepopen.so \
libgensio-kiss.so \
libgensio-mdns.so \
libgensio-msgdelim.so \
libgensio-mux.so \
libgensio-net.so \
libgensio-perf.so \
libgensio-pty.so \
libgensio-ratelimit.so \
libgensio-relpkt.so \
libgensio-script.so \
libgensio-sctp.so \
libgensio-serialdev.so \
libgensio-sound.so \
libgensio-ssl.so \
libgensio-stdio.so \
libgensio-telnet.so \
libgensio-trace.so \
libgensio-udp.so \
libgensio-xlt.so \
libgensio.so.4 \
libgensio4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOpenIPMI.so.0 \
libOpenIPMIutils.so.0 \
libc.so.6 \
libcrypto.so.3 \
libgensiomdns.so.0 \
libgensioosh.so.0 \
libssl.so.3"

inherit rpm
