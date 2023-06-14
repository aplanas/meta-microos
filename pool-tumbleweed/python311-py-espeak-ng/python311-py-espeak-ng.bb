SUMMARY = "Python interface for eSpeak NG"
DESCRIPTION = "Python interface for eSpeak NG, a speech synthesis library."
LICENSE = "Apache-2.0"

PV = "0.1.8"

RPM_NAME = "python311-py-espeak-ng-0.1.8-1.14.noarch.rpm"
RPM_HASH = "36a38ae2b1af05177e94fcd9c0af01b194970ffe119e5bfc5f690d2b71ee0eed3e9bb99266209dfe057919e01ec520752cb34e99d05756c7c6a71bec93574257"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-py-espeak-ng \
python311-py-espeak-ng \
python3dist-py-espeak-ng"

RDEPENDS:${PN} += "espeak-ng \
python-abi"

inherit rpm
