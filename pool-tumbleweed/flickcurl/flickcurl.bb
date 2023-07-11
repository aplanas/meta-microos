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

RPM_NAME = "flickcurl-1.26-3.25.aarch64.rpm"
RPM_HASH = "9c6bab059175edc723bc6c7fe7ae3f56a072ab5d7fc4e5830a74293a054b8cc5e39b52f2774dbc1ac21d2b1d03bb798709b68ab5ef29b875130b96a1afc898b7"

RPROVIDES:${PN} += "flickcurl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libflickcurl.so.0 \
libraptor2.so.0"

inherit rpm
