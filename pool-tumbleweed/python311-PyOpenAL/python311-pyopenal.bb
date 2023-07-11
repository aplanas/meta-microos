SUMMARY = "Python bindings for OpenAL"
DESCRIPTION = "PyOpenAL provides OpenAL bindings for Python as well as an interface \
to them. \
 \
It also provides a way to play WAVE and, if PyOgg is \
installed, OGG Vorbis, OGG Opus and FLAC files."
LICENSE = "SUSE-Public-Domain"

PV = "0.7.11a1"

RPM_NAME = "python311-PyOpenAL-0.7.11a1-1.15.noarch.rpm"
RPM_HASH = "e20476cdbb1963013ec7db646644ed474b48602197a78d4ca09d5ff31713cf72124b7f6a1e510fd22e272c719f09e588dd6f23ea5a696b3bc6abd58644ad557f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyOpenAL \
python3.11dist-pyopenal \
python311-PyOpenAL \
python3dist-pyopenal"

RDEPENDS:${PN} += "libopenal1 \
python-abi"

inherit rpm
