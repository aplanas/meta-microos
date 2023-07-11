SUMMARY = "Python bindings for OpenAL"
DESCRIPTION = "PyOpenAL provides OpenAL bindings for Python as well as an interface \
to them. \
 \
It also provides a way to play WAVE and, if PyOgg is \
installed, OGG Vorbis, OGG Opus and FLAC files."
LICENSE = "SUSE-Public-Domain"

PV = "0.7.11a1"

RPM_NAME = "python310-PyOpenAL-0.7.11a1-1.15.noarch.rpm"
RPM_HASH = "1d63d62e5bd5dfe464cc338aab377867137798ed39ddcfaf51c336ff5bb052e73d9cb6e18a2e10bd2c76fafab3cf2876109fa6fd0d4e16097e18118dda5ab081"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyopenal \
python310-PyOpenAL \
python3dist-pyopenal"

RDEPENDS:${PN} += "libopenal1 \
python-abi"

inherit rpm
