SUMMARY = "A library for guessing information from video files"
DESCRIPTION = "GuessIt is a Python library that extracts as much information as \
possible from a video file. \
It has a filename matcher that allows to guess a lot of metadata from \
a video using its filename only. This matcher works with both movies \
and TV shows episodes."
LICENSE = "LGPL-3.0-only"

PV = "3.7.1"

RPM_NAME = "python310-guessit-3.7.1-1.6.noarch.rpm"
RPM_HASH = "c9f3a974d23252461679e9351f1fd0c7fb7aadcd4df95e1ac5453457fa3c388e9f0699ab8a30b15660bbd20c149c68dc63185758361d1a8380e4634aa40b7812"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-guessit \
python310-guessit \
python3dist-guessit"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-babelfish \
python310-importlib-resources \
python310-python-dateutil \
python310-rebulk \
update-alternatives"

inherit rpm
