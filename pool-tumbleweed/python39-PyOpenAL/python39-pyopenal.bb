SUMMARY = "Python bindings for OpenAL"
DESCRIPTION = "PyOpenAL provides OpenAL bindings for Python as well as an interface \
to them. \
 \
It also provides a way to play WAVE and, if PyOgg is \
installed, OGG Vorbis, OGG Opus and FLAC files."
LICENSE = "SUSE-Public-Domain"

PV = "0.7.11a1"

RPM_NAME = "python39-PyOpenAL-0.7.11a1-1.15.noarch.rpm"
RPM_HASH = "1e075726636be4ace1084f555ba989890eb36ab9390e7eeda687180c4454b0e58f35ea51fd4d5a01b5e007ba09cb798540a8bc47acc0cca0a993a58636e6bb89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyopenal \
python39-PyOpenAL \
python3dist-pyopenal"

RDEPENDS:${PN} += "libopenal1 \
python-abi"

inherit rpm
