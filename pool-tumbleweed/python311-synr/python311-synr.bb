SUMMARY = "A consistent AST for Python"
DESCRIPTION = "A library for a stable Abstract Syntax Tree for Python."
LICENSE = "Apache-2.0"

PV = "0.6.0"

RPM_NAME = "python311-synr-0.6.0-1.8.noarch.rpm"
RPM_HASH = "ac3a089eb6699fa698bed5e90f4740042bc888f9cfef648b87716b376d847354fd0f05d869b6588c93ee8fbb280d7b961dc0dec1c12a7aacf2f2e4b6e60cf0e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-synr \
python3.11dist-synr \
python311-synr \
python3dist-synr"

RDEPENDS:${PN} += "python-abi \
python311-attrs"

inherit rpm
