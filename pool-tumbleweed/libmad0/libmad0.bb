SUMMARY = "An MPEG audio decoder library"
DESCRIPTION = "MAD is a MPEG audio decoder. It currently supports MPEG-1 and the \
MPEG-2 extension to Lower Sampling Frequencies, as well as the \
so-called MPEG 2.5 format. All three audio layers (Layer I, Layer II, \
and Layer III a.k.a. MP3) are implemented. \
 \
MAD supports 24-bit PCM output. MAD computes using 100% fixed-point \
(integer) computation, so you can run it without a floating point \
unit."
LICENSE = "GPL-2.0-or-later"

PV = "0.15.1b"

RPM_NAME = "libmad0-0.15.1b-6.3.aarch64.rpm"
RPM_HASH = "8014a2acc25280940b0d270b1a5bcc669bc98a2e8d26f200949821b4fcf5663ef7b967b951a451a5cc329e94cd5380afaa8fd4be2c07121581e2970c76de18fd"

RPROVIDES:${PN} += "libmad.so.0 \
libmad0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
