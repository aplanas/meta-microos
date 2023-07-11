SUMMARY = "U2F host library for interacting with a U2F device over USB"
DESCRIPTION = "U2F host library for interacting with a U2F device over USB."
LICENSE = "Apache-2.0"

PV = "0.1.5a"

RPM_NAME = "python311-pyu2f-0.1.5a-5.3.noarch.rpm"
RPM_HASH = "74edc55c03ccf5b595139ea0abfee0a4cfc81e46834a328b7f016ca03c3a42a23f9e71ac23e366301c4eef11a1386682b237f90456d92e09d9aa9cf5ce823d63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyu2f \
python3.11dist-pyu2f \
python311-pyu2f \
python3dist-pyu2f"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
