SUMMARY = "Documentation for flickcurl, a Flickr Web Service C library"
DESCRIPTION = "Flickcurl is a C library for calling the Flickr Web service API. It handles the \
API signing, token management, and parameter encoding and decoding, resulting \
in C functions for the Web services APIs. It... uses libcurl to call the REST \
Web service, and libxml2 to manipulate the XML responses. The library supports \
reading photo, tag, and comments information, the photo upload and searching \
APIs, and writing tags and comments. It provides utilities such as 'flickcurl' \
to exercise the API and 'flickrdf' to get RDF metadata descriptions out of \
photos, tags, and machine tags. \
 \
This subpackage contains the developer documentation for flickcurl."
LICENSE = "LGPL-2.1"

PV = "1.26"

RPM_NAME = "flickcurl-doc-1.26-3.24.aarch64.rpm"
RPM_HASH = "44cca27cd6aaa2a9d90deff14b2986312bd5b2d8bbca0c2e67c045ae73ea55f2ab3822967368d68b70bb266d124dc3ffc94821e0118b2fbbfdcfb6dfd6a3817e"

RPROVIDES:${PN} += "flickcurl-doc \
flickcurl-doc(aarch-64)"

RDEPENDS:${PN} += "libflickcurl0"

inherit rpm
