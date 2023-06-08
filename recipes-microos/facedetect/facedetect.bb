SUMMARY = "A face detector for batch processing"
DESCRIPTION = "facedetect is a face detector for batch processing. It determines \
whether there is a face in an image and gives back either an exit \
code or the coordinates of each detected face, on standard output. \
 \
It provides a basic command-line interface that can be used with \
software such as ImageMagick."
LICENSE = "GPL-2.0-or-later"

PV = "0.1"

RPM_NAME = "facedetect-0.1-2.8.noarch.rpm"
RPM_HASH = "0bf9c5a6b50394162c259505434a0e9e514b713f95cf5cdbf3c5c5450e8974a3a6e9953db91ff312fca0eb73d51a27539c18ae54458075fd140400f8265aaa43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "facedetect"
RDEPENDS:${PN} += "/usr/bin/python3 python3-numpy python3-opencv"

inherit rpm
