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

RPM_NAME = "flickcurl-doc-1.26-3.25.aarch64.rpm"
RPM_HASH = "74cc0b75cbe5920a66f8cf92cd0db1591e053fb93a6421080bdfbe80cfaeecb46d537e8c014155d493c99177843642f80438ab66e4196289b90d3321d719d23c"

RPROVIDES:${PN} += "flickcurl-doc"

RDEPENDS:${PN} += "libflickcurl0"

inherit rpm
