SUMMARY = "Development files for flickurl, a Flickr Web Service library"
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

RPM_NAME = "libflickcurl-devel-1.26-3.25.aarch64.rpm"
RPM_HASH = "aee5380623073d7f5f09de1125abd37d31bca54d77ffeef408deab75e1928b4f12224bae441b900378385597f0345c066552a834c54111cb8f95495302a2be55"

RPROVIDES:${PN} += "libflickcurl-devel \
pkgconfig-flickcurl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libcurl-devel \
libflickcurl0 \
libraptor-devel \
pkgconfig-libxml-2.0 \
pkgconfig-raptor2"

inherit rpm
