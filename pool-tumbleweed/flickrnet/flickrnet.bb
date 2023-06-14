SUMMARY = "Flickr"
DESCRIPTION = "The Flickr.Net API is a .Net Library for accessing the Flickr API. Written entirely in C# it can be accessed from with any .Net language."
LICENSE = "LGPL-2.1+ | CPL-1.0"

PV = "3.5"

RPM_NAME = "flickrnet-3.5-8.19.noarch.rpm"
RPM_HASH = "4a2ff1d4fa7fd9373522656d03099bc0daae0cbb6677d53821e9fdaa3fd480695dbd9d019709e6786b00c3f86e924f94e07a34a7a84af082e6d086108d7e458b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flickrnet \
mono-FlickrNet"

RDEPENDS:${PN} += "mono-System \
mono-System.Configuration \
mono-System.Drawing \
mono-System.Xml \
mono-mscorlib"

inherit rpm
