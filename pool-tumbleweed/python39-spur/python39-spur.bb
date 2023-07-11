SUMMARY = "Run commands and manipulate files locally or over SSH"
DESCRIPTION = "Run commands and manipulate files locally or over SSH using the same interface"
LICENSE = "BSD-2-Clause"

PV = "0.3.22"

RPM_NAME = "python39-spur-0.3.22-1.6.noarch.rpm"
RPM_HASH = "34b8f91b38ad4c684188ce6347695acb2a26bb98acf686cae87a17313b85f3e3afc1df38bb55628c30cc96a9d13f644753fb60a59d4ee2ceaaad0b0f12d50fea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-spur \
python39-spur \
python3dist-spur"

RDEPENDS:${PN} += "python-abi \
python39-paramiko"

inherit rpm
