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

RPM_NAME = "libgensio4-2.6.1-1.4.aarch64.rpm"
RPM_HASH = "088dfbc4d165554ca3f39dee1eaa87d9bfd4ed5d4922a3eefb93d51d717ff6bcb11476495b9e8cd178ed1b784e3b5033bf814b7e41a1f0806208c398b2366cc8"

RPROVIDES:${PN} += "libgensio.so.4()(64bit) \
libgensio4 \
libgensio4(aarch-64) \
libgensio_afskmdm.so()(64bit) \
libgensio_ax25.so()(64bit) \
libgensio_certauth.so()(64bit) \
libgensio_conacc.so()(64bit) \
libgensio_dummy.so()(64bit) \
libgensio_echo.so()(64bit) \
libgensio_file.so()(64bit) \
libgensio_ipmisol.so()(64bit) \
libgensio_keepopen.so()(64bit) \
libgensio_kiss.so()(64bit) \
libgensio_mdns.so()(64bit) \
libgensio_msgdelim.so()(64bit) \
libgensio_mux.so()(64bit) \
libgensio_net.so()(64bit) \
libgensio_perf.so()(64bit) \
libgensio_pty.so()(64bit) \
libgensio_ratelimit.so()(64bit) \
libgensio_relpkt.so()(64bit) \
libgensio_script.so()(64bit) \
libgensio_sctp.so()(64bit) \
libgensio_serialdev.so()(64bit) \
libgensio_sound.so()(64bit) \
libgensio_ssl.so()(64bit) \
libgensio_stdio.so()(64bit) \
libgensio_telnet.so()(64bit) \
libgensio_trace.so()(64bit) \
libgensio_udp.so()(64bit) \
libgensio_xlt.so()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libOpenIPMI.so.0()(64bit) \
libOpenIPMIutils.so.0()(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libgensiomdns.so.0()(64bit) \
libgensioosh.so.0()(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
