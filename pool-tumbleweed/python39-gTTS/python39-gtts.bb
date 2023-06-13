SUMMARY = "Python module to create MP3 files from spoken text via the Google TTS API"
DESCRIPTION = "gTTS is a Python interface for Google's Text to Speech API. An MP3 \
file may be created with the gTTS module or the gtts-cli command line \
utility. It allows unlimited lengths to be spoken by tokenizing long \
sentences where the speech would naturally pause."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "python39-gTTS-2.3.1-1.5.noarch.rpm"
RPM_HASH = "293285bb60addc89ba8a61998180fefeff456c74c80f411f34d42a447a1db44ebe96b948a54a24f51aa95326c08156783fa6efe4bfb76b511f6244ad5c14b68c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(gtts) \
python39-gTTS \
python3dist(gtts)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-beautifulsoup4 \
python39-click \
python39-gTTS-token \
python39-requests \
python39-setuptools \
python39-six \
update-alternatives"

inherit rpm
