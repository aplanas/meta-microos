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

RPM_NAME = "dd_rescue-1.99.13-2.3.aarch64.rpm"
RPM_HASH = "3b7014c2848bb59f9969ea6e4f7ce9fb1bebc4d26fb2b7818fd9d5a8e961681f462500ddffae8cfdf63aa3d3947a7d28bd0a49db5a0eaaae792c6f4a98b835c3"

RPROVIDES:${PN} += "dd-rescue \
ddrescue \
libddr-hash.so \
libddr-null.so"

RDEPENDS:${PN} += "bc \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
