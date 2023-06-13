SUMMARY = "A Library to Manipulate XML Files"
DESCRIPTION = "The XML C library was initially developed for the GNOME project. It is \
now used by many programs to load and save extensible data structures \
or manipulate any kind of XML files. \
 \
This library implements a number of existing standards related to \
markup languages, including the XML standard, name spaces in XML, XML \
Base, RFC 2396, XPath, XPointer, HTML4, XInclude, SGML catalogs, and \
XML catalogs. In most cases, libxml tries to implement the \
specification in a rather strict way. To some extent, it provides \
support for the following specifications, but does not claim to \
implement them: DOM, FTP client, HTTP client, and SAX. \
 \
The library also supports RelaxNG. Support for W3C XML Schemas is in \
progress."
LICENSE = "MIT"

PV = "2.10.4"

RPM_NAME = "libxml2-2-2.10.4-2.1.aarch64.rpm"
RPM_HASH = "7f00888c2dbc4b2c955188a91a7a51aff4da82cbcfc896651222c26a2d711897827f5f2e9a960ad3d17d16849bf1eea27bc7e53c1e628c98bf2492a0fbf2668d"

RPROVIDES:${PN} += "libxml2-2 \
libxml2-2(aarch-64) \
libxml2.so.2()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
liblzma.so.5()(64bit) \
libm.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
