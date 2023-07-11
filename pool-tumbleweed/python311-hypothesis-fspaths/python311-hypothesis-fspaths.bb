SUMMARY = "Hypothesis extension for generating filesystem paths"
DESCRIPTION = "Hypothesis extension for generating filesystem paths"
LICENSE = "MIT"

PV = "0.1"

RPM_NAME = "python311-hypothesis-fspaths-0.1-2.10.noarch.rpm"
RPM_HASH = "ba394a954d873531e76d13df935989e04fdf771fd1c86a1c0ad98bde8df178d322125fec4f4af1d29aaa831e178a79d759708d63bcd424407c7de253c09cee13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hypothesis-fspaths \
python3.11dist-hypothesis-fspaths \
python311-hypothesis-fspaths \
python3dist-hypothesis-fspaths"

RDEPENDS:${PN} += "python-abi \
python311-hypothesis"

inherit rpm
