SUMMARY = "A library for guessing information from video files"
DESCRIPTION = "GuessIt is a Python library that extracts as much information as \
possible from a video file. \
It has a filename matcher that allows to guess a lot of metadata from \
a video using its filename only. This matcher works with both movies \
and TV shows episodes."
LICENSE = "LGPL-3.0-only"

PV = "3.7.1"

RPM_NAME = "python311-guessit-3.7.1-1.6.noarch.rpm"
RPM_HASH = "9b317775197f0886755646711126f0630a9870b306c5c34657e2a8c491de27fd786fa7bc849cb0487ead15db4301483e61cd065e1b74796b657ebcf56c2ee359"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-guessit \
python3.11dist-guessit \
python311-guessit \
python3dist-guessit"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-babelfish \
python311-importlib-resources \
python311-python-dateutil \
python311-rebulk \
update-alternatives"

inherit rpm
