SUMMARY = "A Qt C++ Library for the Last.fm Webservices"
DESCRIPTION = "liblastfm is a collection of libraries to help you integrate Last.fm services \
into your rich desktop software. It is officially supported software developed \
by Last.fm staff."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.0"

RPM_NAME = "liblastfm_fingerprint5-1-1.1.0-1.10.aarch64.rpm"
RPM_HASH = "88b0779a1951a57a64a2cdcbb049c04caf4351cc04bc3162b54530cbea82235913197d28c57736c431a0d687aeff3e876f278d7a32d09db89b0d44d86e3d1ded"

RPROVIDES:${PN} += "liblastfm-fingerprint5-1 \
liblastfm-fingerprint5.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libQt5Sql.so.5 \
libc.so.6 \
libfftw3f.so.3 \
libgcc-s.so.1 \
liblastfm5.so.1 \
libm.so.6 \
libsamplerate.so.0 \
libstdc++.so.6"

inherit rpm
