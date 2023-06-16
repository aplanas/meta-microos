SUMMARY = "RDF Storage and SPARQL Query Engine"
DESCRIPTION = "4store was designed by Steve Harris and developed at Garlik to underpin \
their Semantic Web applications. It has been providing the base platform \
for around 3 years. At times holding and running queries over databases of \
15GT, supporting a Web application used by thousands of people."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.6"

RPM_NAME = "4store-1.1.6-3.14.aarch64.rpm"
RPM_HASH = "b635d7ffa51162af6101b5fc696eac0a6b256b9fc038436e5c30ac72cb9f05336f0112e612cd7d0fb3e20952268f5169563ad6dc3cd8cfbfb6dabe95e57479a8"

RPROVIDES:${PN} += "4store"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libavahi-glib.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgthread-2.0.so.0 \
libm.so.6 \
libpcre.so.1 \
libraptor2.so.0 \
librasqal.so.3 \
libreadline.so.8 \
libuuid.so.1 \
libz.so.1"

inherit rpm
