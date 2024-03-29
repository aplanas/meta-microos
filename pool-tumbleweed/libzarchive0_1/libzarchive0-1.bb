SUMMARY = "ZArchive library"
DESCRIPTION = "This subpackage contains the ZArchive library"
LICENSE = "MIT-0"

PV = "0.1.2+git20220908.d2c7177"

RPM_NAME = "libzarchive0_1-0.1.2+git20220908.d2c7177-3.1.aarch64.rpm"
RPM_HASH = "b301d127189bb89854d1598492787cad3ebe71749d32717403802b4f6876ec528834e386aa50c4b53983d7b3f0be83ae0e0710f390fe9b3b48517fbf0cd17839"

RPROVIDES:${PN} += "libzarchive.so.0.1 \
libzarchive0-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libzstd.so.1"

inherit rpm
