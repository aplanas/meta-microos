SUMMARY = "Python tools to interact with SAP HANA utilities"
DESCRIPTION = "API to expose SAP HANA functionalities"
LICENSE = "Apache-2.0"

PV = "0.3.13+git.1673855974.f208fad"

RPM_NAME = "python310-shaptools-0.3.13+git.1673855974.f208fad-1.6.noarch.rpm"
RPM_HASH = "aebe409125cb26665dcc73808af9c03175a7404da9967c3a00efb150cd6f44998ac2024960fe5ade919188002ba455e12800ee98f371632525a8208821e68980"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-shaptools \
python310-shaptools \
python3dist-shaptools"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
