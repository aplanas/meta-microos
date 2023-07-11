SUMMARY = "A consistent AST for Python"
DESCRIPTION = "A library for a stable Abstract Syntax Tree for Python."
LICENSE = "Apache-2.0"

PV = "0.6.0"

RPM_NAME = "python310-synr-0.6.0-1.8.noarch.rpm"
RPM_HASH = "7e488025c8ce7f0532c2181281c44f1d3cf3b2ddf915c525616ca4b222ef192447f4856f150e9db60ceb950f15b4e08c8a50bc1dad670793801ad4180d33e8b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-synr \
python310-synr \
python3dist-synr"

RDEPENDS:${PN} += "python-abi \
python310-attrs"

inherit rpm
