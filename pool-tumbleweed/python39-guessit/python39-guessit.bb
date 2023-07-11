SUMMARY = "A library for guessing information from video files"
DESCRIPTION = "GuessIt is a Python library that extracts as much information as \
possible from a video file. \
It has a filename matcher that allows to guess a lot of metadata from \
a video using its filename only. This matcher works with both movies \
and TV shows episodes."
LICENSE = "LGPL-3.0-only"

PV = "3.7.1"

RPM_NAME = "python39-guessit-3.7.1-1.6.noarch.rpm"
RPM_HASH = "0d19f5f782e07d36ce5d5731f0bb1ead6763021cff0811ac1142101d06db1770f0811f9344a79af832aa7f80ac804556c226a4108fbb18b52c357d94eb3ab4bd"
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
