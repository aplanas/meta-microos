SUMMARY = "A better mock for file I/O"
DESCRIPTION = "A better mock for file I/O"
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python39-mock-open-1.4.0-2.11.noarch.rpm"
RPM_HASH = "99cbf7bdc48f9da1f834ea7c1150e7647fbac58b57bb6d799db4710e3caa9763805e47161c21e43102601b879a395d52e8a33d6babe48555a91d9bbd7dc19fc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(mock-open) \
python39-mock-open \
python3dist(mock-open)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
