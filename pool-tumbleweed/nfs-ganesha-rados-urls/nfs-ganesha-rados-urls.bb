SUMMARY = "The NFS-GANESHA library for use with RADOS URLs"
DESCRIPTION = "This package contains the libganesha_rados_urls library used for \
handling RADOS URL configurations."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.3+git0.39e0cf712"

RPM_NAME = "nfs-ganesha-rados-urls-3.3+git0.39e0cf712-5.8.aarch64.rpm"
RPM_HASH = "cec0e2d90b5337c06563a29a595697d263856c877172077dc64fc630823dfa052ba8eb29ecc4afe56da13314443e9f335bc692c6d7406e8ec870bf2dccd20a46"

RPROVIDES:${PN} += "libganesha-rados-urls.so \
nfs-ganesha-rados-urls"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libganesha-nfsd.so.3.3 \
librados.so.2 \
nfs-ganesha"

inherit rpm
