SUMMARY = "Core library for anymarkup"
DESCRIPTION = "This is the core library that implements functionality of \
python-anymarkup."
LICENSE = "BSD-3-Clause"

PV = "0.8.1"

RPM_NAME = "python39-anymarkup-core-0.8.1-3.5.noarch.rpm"
RPM_HASH = "6eda6ede58ead960b0820292ca003306963ec66be6c344df63c9792aeb03eb84ebb55ce85510e8c5ae7f3697f224ddd4996a4c9877b81d60ffa91052a9988fbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-anymarkup-core \
python39-anymarkup-core \
python3dist-anymarkup-core"

RDEPENDS:${PN} += "python-abi"

inherit rpm
