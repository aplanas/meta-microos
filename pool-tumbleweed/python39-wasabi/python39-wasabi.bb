SUMMARY = "A lightweight console printing and formatting toolkit"
DESCRIPTION = "A lightweight console printing and formatting toolkit."
LICENSE = "LGPL-3.0-only"

PV = "1.1.1"

RPM_NAME = "python39-wasabi-1.1.1-1.1.noarch.rpm"
RPM_HASH = "89d916499c42e87e401405f6c970ac96fdce74694059c0a16873e49ea09a8469831419ef5b827d79d57368db13d4cdcc98475f41d29aa938464a24f8f32d06b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-wasabi \
python39-wasabi \
python3dist-wasabi"

RDEPENDS:${PN} += "python-abi"

inherit rpm
