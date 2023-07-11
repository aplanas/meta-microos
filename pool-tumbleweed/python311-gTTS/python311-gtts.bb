SUMMARY = "Python module to create MP3 files from spoken text via the Google TTS API"
DESCRIPTION = "gTTS is a Python interface for Google's Text to Speech API. An MP3 \
file may be created with the gTTS module or the gtts-cli command line \
utility. It allows unlimited lengths to be spoken by tokenizing long \
sentences where the speech would naturally pause."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "python311-gTTS-2.3.1-1.6.noarch.rpm"
RPM_HASH = "6ed77e6b867b515c303951895e00d8621d9632e0a1a786ed052f72cb0e89d103e709c77956965459010c2a21809ea43b7b068d4b4faec4cbf725f41d6ee93d70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gTTS \
python3.11dist-gtts \
python311-gTTS \
python3dist-gtts"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-beautifulsoup4 \
python311-click \
python311-gTTS-token \
python311-requests \
python311-setuptools \
python311-six \
update-alternatives"

inherit rpm
