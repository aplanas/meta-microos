SUMMARY = "Module to extract semantic information about static Python code"
DESCRIPTION = "A module to extract semantic information about static Python code."
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "python39-beniget-0.4.1-2.1.noarch.rpm"
RPM_HASH = "d16eb5b123583fbdd03dac90b6dc831afbc6af4f73cf56c3fa6d66db1126a6c16b8a1c15f88a2c273bea3e8befc2d37e4de38a3473595d401b49b0d7173aaa9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(beniget) \
python39-beniget \
python3dist(beniget)"

RDEPENDS:${PN} += "python(abi) \
python39-gast"

inherit rpm
