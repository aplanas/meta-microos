SUMMARY = "Command-Line Tools for the Flickr Web Service"
DESCRIPTION = "Flickcurl is a C library for calling the Flickr Web service API. It handles the \
API signing, token management, and parameter encoding and decoding, resulting \
in C functions for the Web services APIs. It... uses libcurl to call the REST \
Web service, and libxml2 to manipulate the XML responses. The library supports \
reading photo, tag, and comments information, the photo upload and searching \
APIs, and writing tags and comments. It provides utilities such as 'flickcurl' \
to exercise the API and 'flickrdf' to get RDF metadata descriptions out of \
photos, tags, and machine tags."
LICENSE = "LGPL-2.1"

PV = "1.26"

RPM_NAME = "flickcurl-1.26-3.24.aarch64.rpm"
RPM_HASH = "60ee64912c2f93890371f2d40b05befb5154e8d09533606c091ddaff4f0fb6430cd67249fa42be5ffa6493188bb2d349b1db717dc347910e70a19afc565d0ac2"

RPROVIDES:${PN} += "flickcurl \
flickcurl(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcurl.so.4()(64bit) \
libflickcurl.so.0()(64bit) \
libraptor2.so.0()(64bit)"

inherit rpm
