SUMMARY = "Python tools to interact with SAP HANA utilities"
DESCRIPTION = "API to expose SAP HANA functionalities"
LICENSE = "Apache-2.0"

PV = "0.3.13+git.1673855974.f208fad"

RPM_NAME = "python39-shaptools-0.3.13+git.1673855974.f208fad-1.6.noarch.rpm"
RPM_HASH = "e244f3b727ebf7591d14a310e9a2291624ee3aeef41dcaa6366bf476ed24463015b9cf0299cbd7d9cda407ac8b5b98ada18a535c1eea9e305fcc25dbd4b53e1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-shaptools \
python39-shaptools \
python3dist-shaptools"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
