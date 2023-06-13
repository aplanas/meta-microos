SUMMARY = "Development files for Flickr.Net"
DESCRIPTION = "The Flickr.Net API is a .NET Library for interacting with the Flickr API. It \
can be accessed from any .NET language. \
 \
The flickrnet-devel package contains development files for flickrnet."
LICENSE = "LGPL-2.1+ | CPL-1.0"

PV = "3.5"

RPM_NAME = "flickrnet-devel-3.5-8.19.noarch.rpm"
RPM_HASH = "8ca44037e7590b3784b1cad43add24f8edd8b48dc557ab3be2532a6dfd964009220e467e69a15eaf4ea10df331e02fbfd7ea129bb63e44a02ffa9df4a612e869"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flickrnet-devel \
pkgconfig(flickrnet)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
flickrnet \
pkgconfig"

inherit rpm
