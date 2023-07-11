SUMMARY = "The NFS-GANESHA library for use with RADOS URLs"
DESCRIPTION = "This package contains the libganesha_rados_urls library used for \
handling RADOS URL configurations."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.3+git0.39e0cf712"

RPM_NAME = "nfs-ganesha-rados-urls-3.3+git0.39e0cf712-5.9.aarch64.rpm"
RPM_HASH = "537578942223584bc138ec9c663b6c25955a78b27bf841457b3470ee94cc8e0896c7684539c972268f8fcd1722a4c6aa0c4870ce079f0fb354ad9086a581a948"

RPROVIDES:${PN} += "libganesha-rados-urls.so \
nfs-ganesha-rados-urls"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libganesha-nfsd.so.3.3 \
librados.so.2 \
nfs-ganesha"

inherit rpm
