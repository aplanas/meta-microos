SUMMARY = "An HTML Minifier"
DESCRIPTION = "A configurable HTML Minifier with safety features."
LICENSE = "BSD-3-Clause"

PV = "0.1.12"

RPM_NAME = "python39-htmlmin-0.1.12-3.13.noarch.rpm"
RPM_HASH = "140327cf57d99cab865a7a0e3b2436a17dc00888ec1395f8befb4e2ee84c3b3dc0ea4233fb42adb7d2beb0146072864b1d76390ea8061287956fc75d95735c55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-htmlmin \
python39-htmlmin \
python3dist-htmlmin"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-setuptools \
update-alternatives"

inherit rpm
