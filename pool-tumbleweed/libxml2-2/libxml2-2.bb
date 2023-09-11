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

RPM_NAME = "libxml2-2-2.10.4-3.1.aarch64.rpm"
RPM_HASH = "197f7d498e82e6313e5b283888569ec89f4b04972d004299bfcda6469bfc517ff6d578cc3504406f2e4dc5cb343852f90300b952ffb25148f37143a8aa340f78"

RPROVIDES:${PN} += "libxml2-2 \
libxml2.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblzma.so.5 \
libm.so.6 \
libz.so.1"

inherit rpm
