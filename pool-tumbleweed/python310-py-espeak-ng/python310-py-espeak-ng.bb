SUMMARY = "Python interface for eSpeak NG"
DESCRIPTION = "Python interface for eSpeak NG, a speech synthesis library."
LICENSE = "Apache-2.0"

PV = "0.1.8"

RPM_NAME = "python310-py-espeak-ng-0.1.8-1.16.noarch.rpm"
RPM_HASH = "1dd1d0132a627becdb85564bd57c95335e2f881beba6821fd596a75a01a37ed29bef30360fca1e17a6c0f4430b61ca5f901a8a49346746b59fe0de769976637c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-py-espeak-ng \
python310-py-espeak-ng \
python3dist-py-espeak-ng"

RDEPENDS:${PN} += "espeak-ng \
python-abi"

inherit rpm
