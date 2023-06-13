SUMMARY = "Data copying in the presence of I/O Errors"
DESCRIPTION = "dd_rescue helps when nothing else can: your disk has crashed and you \
try to copy it over to another one. While standard Unix tools like cp, \
cat, and dd will 'abort' on every I/O error, dd_rescue does not. \
 \
dd_rescue has many other goodies; optimization by using large blocks \
as long as no errors are in sight and falling back to small ones; reverse \
direction copy; splice in-kernel zerocopy; O_DIRECT support; preallocation \
with fallocate(). \
 \
dd_rescue also provides data protection features by overwriting files \
or disks with fast random numbers, optionally multiple times. \
 \
dd_rescue supports plugins; currently a hash, an lzo and a crypt plugin \
exist, supporting on the fly hash/HMAC calculation/validation, lzo \
de/compression and de/encryption. The lzo plugin is packaged in the \
dd_rescue-lzo, the crypt plugin in the dd_rescue-crypt subpackage."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "1.99.13"

RPM_NAME = "dd_rescue-1.99.13-2.2.aarch64.rpm"
RPM_HASH = "f842e6524f328933c631be5d8ca845a5ef3ff34ede0a8cd195df4234b33e7045dbc2c34419421f539b6aabfe7453db08ff5692b63cf59f067f2d91fc386d0c1b"

RPROVIDES:${PN} += "dd_rescue \
dd_rescue(aarch-64) \
ddrescue \
libddr_hash.so()(64bit) \
libddr_null.so()(64bit)"

RDEPENDS:${PN} += "bc \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
