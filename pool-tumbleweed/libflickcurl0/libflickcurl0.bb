SUMMARY = "C Library API to the Flickr Web Service"
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

RPM_NAME = "libflickcurl0-1.26-3.25.aarch64.rpm"
RPM_HASH = "9ee920d1affd32c0124d382cc903db9ed952e6d6ab1ede02523dd019f1239d4b8c50eecb7a3c1436eef94cf1617d370f001ad01e62013207ef7bbe62ecd796e2"

RPROVIDES:${PN} += "libflickcurl.so.0 \
libflickcurl0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libxml2.so.2"

inherit rpm
