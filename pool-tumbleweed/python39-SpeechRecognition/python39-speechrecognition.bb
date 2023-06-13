SUMMARY = "Library for performing speech recognition, with support for several engines"
DESCRIPTION = "SpeechRecognition Library for performing speech recognition, with support for several engines and APIs, online and offline. \
 \
The Speech recognition engine/API supports CMU Sphinx (works offline), Google Speech Recognition, \
Google Cloud Speech API, Wit.ai, Microsoft Bing Voice Recognition, Houndify API and \
IBM Speech to Text"
LICENSE = "BSD-3-Clause"

PV = "3.8.1"

RPM_NAME = "python39-SpeechRecognition-3.8.1-5.4.noarch.rpm"
RPM_HASH = "8c89f2339d7f3ba82679339e15170dd584fe0ebbb11c3b169753ef12599057ae04ab18c33d774e49cc8d105b284eaa0f8b17d504e2300c189090075218597dac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(speechrecognition) \
python39-SpeechRecognition \
python3dist(speechrecognition)"

RDEPENDS:${PN} += "flac \
python(abi) \
python-SpeechRecognition-common-en-US \
python39-PyAudio \
python39-google-cloud-speech"

inherit rpm
