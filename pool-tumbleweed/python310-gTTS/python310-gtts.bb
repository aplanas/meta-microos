SUMMARY = "Python module to create MP3 files from spoken text via the Google TTS API"
DESCRIPTION = "gTTS is a Python interface for Google's Text to Speech API. An MP3 \
file may be created with the gTTS module or the gtts-cli command line \
utility. It allows unlimited lengths to be spoken by tokenizing long \
sentences where the speech would naturally pause."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "python310-gTTS-2.3.1-1.6.noarch.rpm"
RPM_HASH = "20d0d89a14fc66923848c63cb4f9c15aaa2b69ee91bb14c18eb61ad22f2c83c0ad18ad148cf3665b24c63635e9f3aaab384940faaacf3221808bd21812d68235"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-gtts \
python310-gTTS \
python3dist-gtts"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-beautifulsoup4 \
python310-click \
python310-gTTS-token \
python310-requests \
python310-setuptools \
python310-six \
update-alternatives"

inherit rpm
