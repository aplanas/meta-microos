SUMMARY = "Python module to create MP3 files from spoken text via the Google TTS API"
DESCRIPTION = "gTTS is a Python interface for Google's Text to Speech API. An MP3 \
file may be created with the gTTS module or the gtts-cli command line \
utility. It allows unlimited lengths to be spoken by tokenizing long \
sentences where the speech would naturally pause."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "python39-gTTS-2.3.1-1.6.noarch.rpm"
RPM_HASH = "d882332e2d86b1142d9fff54aa27adb747f69e445e78caa8a2135ee14f21ce1603824a72701df439a089648bd480be2505d8fca4ab2abb817a853fe57891053f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-gtts \
python39-gTTS \
python3dist-gtts"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-beautifulsoup4 \
python39-click \
python39-gTTS-token \
python39-requests \
python39-setuptools \
python39-six \
update-alternatives"

inherit rpm
