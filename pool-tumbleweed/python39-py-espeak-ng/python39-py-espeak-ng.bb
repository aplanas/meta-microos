SUMMARY = "Python interface for eSpeak NG"
DESCRIPTION = "Python interface for eSpeak NG, a speech synthesis library."
LICENSE = "Apache-2.0"

PV = "0.1.8"

RPM_NAME = "python39-py-espeak-ng-0.1.8-1.14.noarch.rpm"
RPM_HASH = "e49bd801ad9c39375bd95cb9dcd58b5d4573045bfe2aaffc8a3147302c0c9153840e31b51b06f7189f4e86691ea9aa335f7c3351594318c4489d26db788022f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(py-espeak-ng) \
python39-py-espeak-ng \
python3dist(py-espeak-ng)"

RDEPENDS:${PN} += "espeak-ng \
python(abi)"

inherit rpm
