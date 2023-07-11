SUMMARY = "Python interface for eSpeak NG"
DESCRIPTION = "Python interface for eSpeak NG, a speech synthesis library."
LICENSE = "Apache-2.0"

PV = "0.1.8"

RPM_NAME = "python311-py-espeak-ng-0.1.8-1.16.noarch.rpm"
RPM_HASH = "ec8a6e4cd0c600b18501f7183e79b6c7666c63607377b999d92356f8890388a498c3f24cafeef0facc8e316d37e4773fbd1c91906dc34fe63160651f78922d93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-py-espeak-ng \
python3.11dist-py-espeak-ng \
python311-py-espeak-ng \
python3dist-py-espeak-ng"

RDEPENDS:${PN} += "espeak-ng \
python-abi"

inherit rpm
