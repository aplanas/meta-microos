SUMMARY = "Python bindings for OpenAL"
DESCRIPTION = "PyOpenAL provides OpenAL bindings for Python as well as an interface \
to them. \
 \
It also provides a way to play WAVE and, if PyOgg is \
installed, OGG Vorbis, OGG Opus and FLAC files."
LICENSE = "SUSE-Public-Domain"

PV = "0.7.11a1"

RPM_NAME = "python311-PyOpenAL-0.7.11a1-1.14.noarch.rpm"
RPM_HASH = "98b720ee587e6edb9644792f53c5641cd8f29e001b0790209ecbad15e6fcdfa9f0a25b20e691634b17c5733e3c0fa6aee1fc622618f942eb5ab05dfa7d8b19bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyopenal) \
python311-PyOpenAL \
python3dist(pyopenal)"

RDEPENDS:${PN} += "libopenal1 \
python(abi)"

inherit rpm
