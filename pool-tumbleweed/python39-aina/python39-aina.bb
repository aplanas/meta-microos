SUMMARY = "A general-purpose stream processing framework"
DESCRIPTION = "Aina is a general-purpose stream processing framework. It includes a \
templating system which powers a command line utility."
LICENSE = "GPL-3.0-only"

PV = "0.1.3"

RPM_NAME = "python39-aina-0.1.3-4.11.noarch.rpm"
RPM_HASH = "9bcbe09e9a6f170a4bf88ca6e06ae06f097b5222f398ba7778fb66b021234e241eb586f83ae74c41b196d867f92c8536d8121312ee9cc2e32bea272dfad520a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-aina \
python39-aina \
python3dist-aina"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-base \
python39-click \
update-alternatives"

inherit rpm
