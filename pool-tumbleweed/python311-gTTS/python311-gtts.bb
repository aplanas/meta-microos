SUMMARY = "Python module to create MP3 files from spoken text via the Google TTS API"
DESCRIPTION = "gTTS is a Python interface for Google's Text to Speech API. An MP3 \
file may be created with the gTTS module or the gtts-cli command line \
utility. It allows unlimited lengths to be spoken by tokenizing long \
sentences where the speech would naturally pause."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "python311-gTTS-2.3.1-1.5.noarch.rpm"
RPM_HASH = "b7c2f357db7dd23fc3d087d4ec98098da6000ea11508c3ad327887a9fad9dc0b74abc1cd7ceb2e959485bf567c9ed8072d333ab399383e90017aae68e22e852d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(gtts) \
python311-gTTS \
python3dist(gtts)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-beautifulsoup4 \
python311-click \
python311-gTTS-token \
python311-requests \
python311-setuptools \
python311-six \
update-alternatives"

inherit rpm
