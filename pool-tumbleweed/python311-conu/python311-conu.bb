SUMMARY = "Python container testing library"
DESCRIPTION = "Python container testing library."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-conu-1.0.0-2.5.noarch.rpm"
RPM_HASH = "b3467118679951e3f63fe672d6b2092fe08c100c43219678943ca391e82a3140496733ff02a1020914ee05ef1d0c295cde56db0a1c29f7a78317fcfef3a13f79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-conu \
python3.11dist-conu \
python311-conu \
python3dist-conu"

RDEPENDS:${PN} += "python-abi \
python311-docker \
python311-flexmock \
python311-kubernetes \
python311-pytest \
python311-requests"

inherit rpm
