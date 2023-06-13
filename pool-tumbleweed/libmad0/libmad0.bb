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

RPM_NAME = "libmad0-0.15.1b-6.2.aarch64.rpm"
RPM_HASH = "ca56d1671eff831ee10d6508e42cb7c84e6dbf0655acc9408877cbf863aadffbaa40f751493b6052b16048982f403fe25cf9e69625a55c7488767f1ce1f79628"

RPROVIDES:${PN} += "libmad.so.0()(64bit) \
libmad0 \
libmad0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
