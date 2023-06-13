SUMMARY = "A Python MPD client library"
DESCRIPTION = "The python-mpd2 package is a Python library which provides \
a client interface for the Music Player Daemon. \
 \
python-mpd2 is a fork of python-mpd.  While 0.4.x was backwards compatible \
with python-mpd, starting with 0.5 provides enhanced features which are *NOT* \
backward compatibles with the original python-mpd package."
LICENSE = "LGPL-3.0-only"

PV = "3.0.5"

RPM_NAME = "python39-python-mpd2-3.0.5-1.5.noarch.rpm"
RPM_HASH = "1938f4621b8de32f58d6e9d1a6f7ab67eb302d8da4ae7bf0fa316e8dc689c06325c603d93e26372f81d24c43f92a78f234946b111837e94e0b6d600c466d8abb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-mpd2) \
python39-python-mpd2 \
python3dist(python-mpd2)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
