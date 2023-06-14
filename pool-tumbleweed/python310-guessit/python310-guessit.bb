SUMMARY = "A library for guessing information from video files"
DESCRIPTION = "GuessIt is a Python library that extracts as much information as \
possible from a video file. \
It has a filename matcher that allows to guess a lot of metadata from \
a video using its filename only. This matcher works with both movies \
and TV shows episodes."
LICENSE = "LGPL-3.0-only"

PV = "3.7.1"

RPM_NAME = "python310-guessit-3.7.1-1.4.noarch.rpm"
RPM_HASH = "6c9a4ac859029534e5e931ea3c63c954f46884734183118f4ceabe80358db659b10928bf20f29d63f755d4d7ff7e9b8f35f2af41decbf17f3778081aecd11617"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-guessit \
python3.10dist-guessit \
python310-guessit \
python3dist-guessit"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-babelfish \
python310-importlib-resources \
python310-python-dateutil \
python310-rebulk \
update-alternatives"

inherit rpm
