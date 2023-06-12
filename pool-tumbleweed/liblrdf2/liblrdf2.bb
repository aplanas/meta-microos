SUMMARY = "A library to Manipulate RDF Files for LADSPA Plug-Ins"
DESCRIPTION = "This is a library to make it easy to manipulate RDF files describing \
LADSPA plug-ins. It can also be used for general RDF manipulation. \
 \
It can read RDF, XLM, and N3 files and export N3 files. Ot also has a \
light taxonomic inference capability."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.1"

RPM_NAME = "liblrdf2-0.6.1-1.12.aarch64.rpm"
RPM_HASH = "29d3b89bc2b4eb364067c473fb8f2076c2f1eb5446ed755fb7664c24c8e3af534ad8a882f7797e267e89d4cc435064fccdec45bc8db5b4cdea717a000b8c1c2a"

RPROVIDES:${PN} += "liblrdf \
liblrdf.so.2()(64bit) \
liblrdf2 \
liblrdf2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libraptor2.so.0()(64bit)"

inherit rpm
