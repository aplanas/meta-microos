SUMMARY = "C-language implementation of Javascript Object Signing and Encryption"
DESCRIPTION = "José is a C-language implementation of the Javascript Object Signing and Encryption standards."
LICENSE = "Apache-2.0"

PV = "11"

RPM_NAME = "jose-11-1.1.aarch64.rpm"
RPM_HASH = "b764332da1198da84a02730fad66f2ae42f2f643b59c5118237d712fa154afa770a00414ba844db79a1f37ea58830cdeebd4ee4bbb745ad37635763930504f69"

RPROVIDES:${PN} += "jose"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjansson.so.4 \
libjose.so.0"

inherit rpm
