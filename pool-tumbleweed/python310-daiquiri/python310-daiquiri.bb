SUMMARY = "Library to configure Python logging"
DESCRIPTION = "The daiquiri library provides a way to configure logging. It also \
provides some custom formatters and handlers."
LICENSE = "Apache-2.0"

PV = "3.2.1"

RPM_NAME = "python310-daiquiri-3.2.1-1.5.noarch.rpm"
RPM_HASH = "c318b63c6afac633bf7216ea83f023fa8a41a57a4d9b15979fafe4e4ac8ac7b1b67369f169a0cdfdf13c6a02632744b1f97e7c293fea9ddb049af9018dfe66ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-daiquiri \
python310-daiquiri \
python3dist-daiquiri"

RDEPENDS:${PN} += "python-abi \
python310-python-json-logger"

inherit rpm
