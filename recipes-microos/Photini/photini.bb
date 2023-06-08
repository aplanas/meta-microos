SUMMARY = "Digital photograph metadata (EXIF, IPTC, XMP) editing application"
DESCRIPTION = "A digital photograph metadata (EXIF, IPTC, XMP) editing application. \
 \
'Metadata' is said to mean 'data about data'. In the context of digital \
photographs, this means information that is not essential in order to display \
the image, but tells something about it. For example, a title and \
description of the scene or the date and time and the GPS coordinates of the \
camera's position when the picture was taken."
LICENSE = "GPL-3.0-or-later"

PV = "2022.3.2"

RPM_NAME = "Photini-2022.3.2-2.4.noarch.rpm"
RPM_HASH = "fd1076e559ff3cf68ab335b82094e76cb03174c607b58bef05219a0c77044d8b39ec7cdb50ecb2afb524820c5295545dcfa30ad3412d8d2330ef2d6ddd6d52be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Photini application() application(photini.desktop) mimehandler(image/gif) mimehandler(image/jpeg) mimehandler(image/jpeg2000) mimehandler(image/png) mimehandler(image/svg+xml) mimehandler(image/tiff) mimehandler(image/x-dcraw) python3.10dist(photini) python3dist(photini)"
RDEPENDS:${PN} += "/usr/bin/python3 ffmpeg libgexiv2-2 python(abi) python3-appdirs python3-gobject python3-gpxpy python3-keyring python3-qt5 python3-qt5-sip python3-requests python3-requests-oauthlib typelib(GExiv2)"

inherit rpm
