SUMMARY = "An HTML Minifier"
DESCRIPTION = "A configurable HTML Minifier with safety features."
LICENSE = "BSD-3-Clause"

PV = "0.1.12"

RPM_NAME = "python310-htmlmin-0.1.12-3.15.noarch.rpm"
RPM_HASH = "3197fe6eda104db455df90d1bd1f81a0992bfa6657744b87304640b872862d11ad15724d0c583dbe51215cec5830f472267b728d896fe02ab6cdc2c26b0d8d23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-htmlmin \
python310-htmlmin \
python3dist-htmlmin"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-setuptools \
update-alternatives"

inherit rpm
