SUMMARY = "Callback API implemented over Proton"
DESCRIPTION = "A messaging framework built on the QPID Proton engine. It \
provides a callback-based API for message passing"
LICENSE = "Apache-2.0"

PV = "2.3.1"

RPM_NAME = "python311-pyngus-2.3.1-1.11.noarch.rpm"
RPM_HASH = "3a81c475703cf36384862fe55384ea3fd46078c18cb92bc203ac5d85b2e7e9594c2aeb58e74a9c4f8164b241b92675d282826b15a903d52cd5040a77728e585d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyngus \
python3.11dist-pyngus \
python311-pyngus \
python3dist-pyngus"

RDEPENDS:${PN} += "python-abi \
python311-python-qpid-proton"

inherit rpm
