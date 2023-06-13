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

RPM_NAME = "python-SpeechRecognition-common-en-US-3.8.1-5.4.noarch.rpm"
RPM_HASH = "5bf00fa7508fa1db6ec7879a4179e30449eecb7507359905e481c4eae38f7f0e5b26116285c8d2643d6cb66767d95729d130767b702067230037ff52f0adf761"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-SpeechRecognition-common-en-US"

RDEPENDS:${PN} += ""

inherit rpm
