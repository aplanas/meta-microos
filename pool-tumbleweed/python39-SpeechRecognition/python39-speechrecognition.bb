SUMMARY = "Library for performing speech recognition, with support for several engines"
DESCRIPTION = "SpeechRecognition Library for performing speech recognition, with support for several engines and APIs, online and offline. \
 \
The Speech recognition engine/API supports CMU Sphinx (works offline), Google Speech Recognition, \
Google Cloud Speech API, Wit.ai, Microsoft Bing Voice Recognition, Houndify API and \
IBM Speech to Text"
LICENSE = "BSD-3-Clause"

PV = "3.8.1"

RPM_NAME = "python39-SpeechRecognition-3.8.1-5.6.noarch.rpm"
RPM_HASH = "9f768a3e0d7942a50604c7f286fd5022496755ec1c501db3f445cde4ae7f067a7f0115a1a4aae56bc9520782316805e5312d89d273606c301530af83031dc64b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-speechrecognition \
python39-SpeechRecognition \
python3dist-speechrecognition"

RDEPENDS:${PN} += "flac \
python-SpeechRecognition-common-en-US \
python-abi \
python39-PyAudio \
python39-google-cloud-speech"

inherit rpm
