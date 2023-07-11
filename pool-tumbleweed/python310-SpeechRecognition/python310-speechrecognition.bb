SUMMARY = "Library for performing speech recognition, with support for several engines"
DESCRIPTION = "SpeechRecognition Library for performing speech recognition, with support for several engines and APIs, online and offline. \
 \
The Speech recognition engine/API supports CMU Sphinx (works offline), Google Speech Recognition, \
Google Cloud Speech API, Wit.ai, Microsoft Bing Voice Recognition, Houndify API and \
IBM Speech to Text"
LICENSE = "BSD-3-Clause"

PV = "3.8.1"

RPM_NAME = "python310-SpeechRecognition-3.8.1-5.6.noarch.rpm"
RPM_HASH = "0c576198d08a894ec170f66d3ecfc70b653dce667bf961c16db894f89014ad5ec616fc538944accc49fb8118ec8b820fe10938e0cd45d1fe384ee29403e3319f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-speechrecognition \
python310-SpeechRecognition \
python3dist-speechrecognition"

RDEPENDS:${PN} += "flac \
python-SpeechRecognition-common-en-US \
python-abi \
python310-PyAudio \
python310-google-cloud-speech"

inherit rpm
