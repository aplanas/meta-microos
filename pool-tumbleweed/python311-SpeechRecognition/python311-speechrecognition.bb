SUMMARY = "Library for performing speech recognition, with support for several engines"
DESCRIPTION = "SpeechRecognition Library for performing speech recognition, with support for several engines and APIs, online and offline. \
 \
The Speech recognition engine/API supports CMU Sphinx (works offline), Google Speech Recognition, \
Google Cloud Speech API, Wit.ai, Microsoft Bing Voice Recognition, Houndify API and \
IBM Speech to Text"
LICENSE = "BSD-3-Clause"

PV = "3.8.1"

RPM_NAME = "python311-SpeechRecognition-3.8.1-5.6.noarch.rpm"
RPM_HASH = "50a8ca33d9909a6c6a46e5cc63e61f5103086061f14bef0461da082146c096220d1b9cc4a2d003f5b9f916101565dac869f5950f1760bbd474a1a8da3e6bcaf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-SpeechRecognition \
python3.11dist-speechrecognition \
python311-SpeechRecognition \
python3dist-speechrecognition"

RDEPENDS:${PN} += "flac \
python-SpeechRecognition-common-en-US \
python-abi \
python311-PyAudio \
python311-google-cloud-speech"

inherit rpm
