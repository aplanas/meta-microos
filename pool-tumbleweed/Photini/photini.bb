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

RPM_NAME = "Photini-2022.3.2-2.6.noarch.rpm"
RPM_HASH = "fd9aeae7a8435c91e3fe920d49de3cb09aa97ab90ef439554a5fa7a39132b0a0c87d1df2e8b7229ade60cbc86a25d08f016b97d11ab2086d0c3a1b9caeb9dffa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Photini \
python3.11dist-photini \
python3dist-photini"

RDEPENDS:${PN} += "/usr/bin/python3 \
ffmpeg \
libgexiv2-2 \
python-abi \
python3-appdirs \
python3-gobject \
python3-gpxpy \
python3-keyring \
python3-qt5 \
python3-qt5-sip \
python3-requests \
python3-requests-oauthlib \
typelib-GExiv2"

inherit rpm
