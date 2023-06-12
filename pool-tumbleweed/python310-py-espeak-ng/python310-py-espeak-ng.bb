SUMMARY = "Python interface for eSpeak NG"
DESCRIPTION = "Python interface for eSpeak NG, a speech synthesis library."
LICENSE = "Apache-2.0"

PV = "0.1.8"

RPM_NAME = "python310-py-espeak-ng-0.1.8-1.14.noarch.rpm"
RPM_HASH = "68c998d2422eb28765e2741bd5714562c6bf7b4dedfe29631ae652d3f0f2845233000e7716e8b92b156028dbbf5d0ee885a03a77b9151697c4016741512f6f39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-py-espeak-ng \
python3.10dist(py-espeak-ng) \
python310-py-espeak-ng \
python3dist(py-espeak-ng)"
RDEPENDS:${PN} += "espeak-ng \
python(abi)"

inherit rpm
