SUMMARY = "A library for guessing information from video files"
DESCRIPTION = "GuessIt is a Python library that extracts as much information as \
possible from a video file. \
It has a filename matcher that allows to guess a lot of metadata from \
a video using its filename only. This matcher works with both movies \
and TV shows episodes."
LICENSE = "LGPL-3.0-only"

PV = "3.7.1"

RPM_NAME = "python39-guessit-3.7.1-1.4.noarch.rpm"
RPM_HASH = "2e76dbf9e6b13c63b87b8cdf5d22c660de68cd9cc79781431bb7a7d78ba44b7f0baf1227eb14de3c7cb54b197c6a5daed3c2d51aff69b89eb316f61b82fecdbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-guessit \
python39-guessit \
python3dist-guessit"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-babelfish \
python39-importlib-resources \
python39-python-dateutil \
python39-rebulk \
update-alternatives"

inherit rpm
