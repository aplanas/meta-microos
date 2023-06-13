SUMMARY = "Python bindings for OpenAL"
DESCRIPTION = "PyOpenAL provides OpenAL bindings for Python as well as an interface \
to them. \
 \
It also provides a way to play WAVE and, if PyOgg is \
installed, OGG Vorbis, OGG Opus and FLAC files."
LICENSE = "SUSE-Public-Domain"

PV = "0.7.11a1"

RPM_NAME = "python39-PyOpenAL-0.7.11a1-1.14.noarch.rpm"
RPM_HASH = "5c336a2d17fc1bdb7db38c437277942645e9a4e91dd33fc61dc35afa71997d1d1ac9e968c58a824a01a20ff16ed4997590249dd863ed02226433904791737f82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyopenal) \
python39-PyOpenAL \
python3dist(pyopenal)"

RDEPENDS:${PN} += "libopenal1 \
python(abi)"

inherit rpm
