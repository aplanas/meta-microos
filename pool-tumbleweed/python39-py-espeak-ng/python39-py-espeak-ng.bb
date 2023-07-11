SUMMARY = "Python interface for eSpeak NG"
DESCRIPTION = "Python interface for eSpeak NG, a speech synthesis library."
LICENSE = "Apache-2.0"

PV = "0.1.8"

RPM_NAME = "python39-py-espeak-ng-0.1.8-1.16.noarch.rpm"
RPM_HASH = "1af6fca77954ab9970257d2f5197206911575f40be0f23c92f4d92e52569e31c88b2c67b8f77e0040069db9a321cc929d24a850d8a855602f4099e027331296c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-py-espeak-ng \
python39-py-espeak-ng \
python3dist-py-espeak-ng"

RDEPENDS:${PN} += "espeak-ng \
python-abi"

inherit rpm
