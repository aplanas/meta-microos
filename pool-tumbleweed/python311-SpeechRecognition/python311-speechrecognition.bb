SUMMARY = "Library for performing speech recognition, with support for several engines"
DESCRIPTION = "SpeechRecognition Library for performing speech recognition, with support for several engines and APIs, online and offline. \
 \
The Speech recognition engine/API supports CMU Sphinx (works offline), Google Speech Recognition, \
Google Cloud Speech API, Wit.ai, Microsoft Bing Voice Recognition, Houndify API and \
IBM Speech to Text"
LICENSE = "BSD-3-Clause"

PV = "3.8.1"

RPM_NAME = "python311-SpeechRecognition-3.8.1-5.4.noarch.rpm"
RPM_HASH = "831f17c317d4043f278f615a6ec46feb7bf40b3c57899a084df102a1fba643a14974f8e363f57aa96e996f66048aecfe4df0032a79faac146afe430a83b87db7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(speechrecognition) \
python311-SpeechRecognition \
python3dist(speechrecognition)"
RDEPENDS:${PN} += "flac \
python(abi) \
python-SpeechRecognition-common-en-US \
python311-PyAudio \
python311-google-cloud-speech"

inherit rpm
