SUMMARY = "Python bindings for OpenAL"
DESCRIPTION = "PyOpenAL provides OpenAL bindings for Python as well as an interface \
to them. \
 \
It also provides a way to play WAVE and, if PyOgg is \
installed, OGG Vorbis, OGG Opus and FLAC files."
LICENSE = "SUSE-Public-Domain"

PV = "0.7.11a1"

RPM_NAME = "python310-PyOpenAL-0.7.11a1-1.14.noarch.rpm"
RPM_HASH = "87d396b396e754a3b4172a1d8246afacde46b297db1a12fc90cee7668e3bb4149c877ddf4585d12749c1b2fcf2427efb52273e3662a37083389da9bf3ab4ed97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyOpenAL \
python3.10dist-pyopenal \
python310-PyOpenAL \
python3dist-pyopenal"

RDEPENDS:${PN} += "libopenal1 \
python-abi"

inherit rpm
