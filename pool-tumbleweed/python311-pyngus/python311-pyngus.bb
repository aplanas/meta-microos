SUMMARY = "Callback API implemented over Proton"
DESCRIPTION = "A messaging framework built on the QPID Proton engine. It \
provides a callback-based API for message passing"
LICENSE = "Apache-2.0"

PV = "2.3.1"

RPM_NAME = "python311-pyngus-2.3.1-1.9.noarch.rpm"
RPM_HASH = "dd76a7d90144c5394afb18500fec623cc48191eadabddf853035f055368043c3c062b97e422519ce69ceded5b38287febbdcb84af85f0e891004561c4c892474"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyngus) \
python311-pyngus \
python3dist(pyngus)"
RDEPENDS:${PN} += "python(abi) \
python311-python-qpid-proton"

inherit rpm
