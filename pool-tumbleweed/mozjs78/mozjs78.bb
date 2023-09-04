SUMMARY = "SpiderMonkey JavaScript library"
DESCRIPTION = "SpiderMonkey is the code-name for Mozilla Firefox's C++ implementation of \
JavaScript. It is intended to be embedded in other applications \
that provide host environments for JavaScript."
LICENSE = "MPL-2.0"

PV = "78.15.0"

RPM_NAME = "mozjs78-78.15.0-3.1.aarch64.rpm"
RPM_HASH = "51a4d249124004ab300363d360a5fe759fe30bc335469ec2633400aa770d1b7c520cd7463551a309bd59f47603d63bef65b455295c9ac8455c8c1aace0c2aead"

RPROVIDES:${PN} += "mozjs78"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libicui18n.so.73 \
libicuuc.so.73 \
libm.so.6 \
libreadline.so.8 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
