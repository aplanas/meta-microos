SUMMARY = "Common files for en-US language model support in python-speech_recognition"
DESCRIPTION = "SpeechRecognition Library for performing speech recognition, with support for \
several engines and APIs, online and offline. \
 \
The Speech recognition engine/API supports CMU Sphinx (works offline), Google \
Speech Recognition, Google Cloud Speech API, Wit.ai, Microsoft Bing Voice \
Recognition, Houndify API and IBM Speech to Text. \
 \
This package contains the data for en-US language model to be used by \
pocketsphinx from python-SpeechRecognition."
LICENSE = "BSD-3-Clause"

PV = "3.8.1"

RPM_NAME = "python-SpeechRecognition-common-en-US-3.8.1-5.6.noarch.rpm"
RPM_HASH = "8866e4bc098c69bb74569b75b2db1118fe796f4d37a90f7d36fb5d861bf1cd5d401039336a55833ca045afec15e5a7084d38601ec0158173c18b1a3e6a8df748"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-SpeechRecognition-common-en-US"

RDEPENDS:${PN} += ""

inherit rpm
