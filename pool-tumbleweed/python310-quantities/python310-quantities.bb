SUMMARY = "Package for physical quantities with units"
DESCRIPTION = "Support for physical quantities with units, based on numpy."
LICENSE = "BSD-3-Clause"

PV = "0.14.1"

RPM_NAME = "python310-quantities-0.14.1-1.1.noarch.rpm"
RPM_HASH = "62f3bc484e82a06eba40c602f4618babcfb6db00d4843d2ed5b7cd84b0c35fbc25771274eb02c2c4e9910044064633dfa0a0d05c787af7164894ce45845fcdc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-quantities \
python3.10dist-quantities \
python310-quantities \
python3dist-quantities"

RDEPENDS:${PN} += "python-abi \
python310-numpy"

inherit rpm
