SUMMARY = "A Python wrapper for tshark output parsing"
DESCRIPTION = "Python wrapper for tshark, allowing python packet parsing using \
wireshark dissectors."
LICENSE = "MIT"

PV = "0.4.6"

RPM_NAME = "python311-pyshark-0.4.6-1.5.noarch.rpm"
RPM_HASH = "e2b6d1c74679a6af0d1bc17227444fed7110ec8bcbd998d33090424bae2324a8461c49bbaf77a45ce0afb4f86d1bea72083b405e55a7f65da3962bcd35eaa23e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyshark) \
python311-pyshark \
python3dist(pyshark)"

RDEPENDS:${PN} += "python(abi) \
python311-lxml \
python311-py \
wireshark"

inherit rpm
