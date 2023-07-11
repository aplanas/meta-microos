SUMMARY = "RDF Storage and SPARQL Query Engine"
DESCRIPTION = "4store was designed by Steve Harris and developed at Garlik to underpin \
their Semantic Web applications. It has been providing the base platform \
for around 3 years. At times holding and running queries over databases of \
15GT, supporting a Web application used by thousands of people."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.6"

RPM_NAME = "4store-1.1.6-3.15.aarch64.rpm"
RPM_HASH = "8630eeeccd67bffeb293daf2e460cf2cef6de9a63bb1b084664402475f5f8ac129d2277f07a8ce591f952fa8fc5fe52e5c484406a5575b00fed5efd26c2cf3ff"

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
