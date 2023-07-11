SUMMARY = "A face detector for batch processing"
DESCRIPTION = "facedetect is a face detector for batch processing. It determines \
whether there is a face in an image and gives back either an exit \
code or the coordinates of each detected face, on standard output. \
 \
It provides a basic command-line interface that can be used with \
software such as ImageMagick."
LICENSE = "GPL-2.0-or-later"

PV = "0.1"

RPM_NAME = "facedetect-0.1-3.1.noarch.rpm"
RPM_HASH = "aabd047931d6ad010b0128aa4af7304eec0377ab0a7c5ca4dd9ac47fdf51868007f436c1b1b257c1d92e4dd84a32169e3754c43f5fa5b098f66a0ace8f561405"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "facedetect"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-numpy \
python3-opencv"

inherit rpm
