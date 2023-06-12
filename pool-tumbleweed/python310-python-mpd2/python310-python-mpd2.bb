SUMMARY = "A Python MPD client library"
DESCRIPTION = "The python-mpd2 package is a Python library which provides \
a client interface for the Music Player Daemon. \
 \
python-mpd2 is a fork of python-mpd.  While 0.4.x was backwards compatible \
with python-mpd, starting with 0.5 provides enhanced features which are *NOT* \
backward compatibles with the original python-mpd package."
LICENSE = "LGPL-3.0-only"

PV = "3.0.5"

RPM_NAME = "python310-python-mpd2-3.0.5-1.5.noarch.rpm"
RPM_HASH = "763c9949cf5dd9478e842ae76f95416bb6bf425252198c2e52cd0f2db088adcba56d3dd211a7afcf4239ddf3448aad2a366f980ad6ecba3397c4713e2a3b782c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-mpd2 \
python3.10dist(python-mpd2) \
python310-python-mpd2 \
python3dist(python-mpd2)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
