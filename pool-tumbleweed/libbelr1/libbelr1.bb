SUMMARY = "Language recognition library"
DESCRIPTION = "Belr parses input formatted according to a language defined by an \
ABNF grammar, such as the protocols standardised at IETF."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.51"

RPM_NAME = "libbelr1-5.2.51-1.1.aarch64.rpm"
RPM_HASH = "21196c9f9e1e685e676bddccec7319ab13f890bc84b6d897adf4183910f1c4dc1df6bf723e840191f553aaf6aeb0ad84c91da88527eed789ff8c433b0da6511a"

RPROVIDES:${PN} += "libbelr.so.1()(64bit) \
libbelr1 \
libbelr1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libbctoolbox.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
