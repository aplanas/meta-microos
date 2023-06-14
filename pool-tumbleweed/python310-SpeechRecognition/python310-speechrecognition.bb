SUMMARY = "Library for performing speech recognition, with support for several engines"
DESCRIPTION = "SpeechRecognition Library for performing speech recognition, with support for several engines and APIs, online and offline. \
 \
The Speech recognition engine/API supports CMU Sphinx (works offline), Google Speech Recognition, \
Google Cloud Speech API, Wit.ai, Microsoft Bing Voice Recognition, Houndify API and \
IBM Speech to Text"
LICENSE = "BSD-3-Clause"

PV = "3.8.1"

RPM_NAME = "python310-SpeechRecognition-3.8.1-5.4.noarch.rpm"
RPM_HASH = "2ff68136e13ca10b3d3b41ac869098ef163c0a9c11ff14dbc7fee2a0eb07514c82ee4272bc01e27b88a995f3ea35c23321196cc858c08d763a27d92a6c9052bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-SpeechRecognition \
python3.10dist-speechrecognition \
python310-SpeechRecognition \
python3dist-speechrecognition"

RDEPENDS:${PN} += "flac \
python-SpeechRecognition-common-en-US \
python-abi \
python310-PyAudio \
python310-google-cloud-speech"

inherit rpm
