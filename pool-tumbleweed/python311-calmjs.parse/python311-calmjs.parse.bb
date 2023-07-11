SUMMARY = "Various parsers for ECMA standards"
DESCRIPTION = "A collection of parsers and helper libraries for understanding \
ECMAScript; a near feature complete fork of slimit."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python311-calmjs.parse-1.3.0-3.1.noarch.rpm"
RPM_HASH = "b29e7c79546a37f7f7b4daf23dba51270f8732d5d08f4a2ed23f50a92ffb052d0d73caa9de94271294668f37447fa3fc5765c77da721975ec455f8ba1143d615"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-calmjs.parse \
python3.11dist-calmjs.parse \
python311-calmjs.parse \
python3dist-calmjs.parse"

RDEPENDS:${PN} += "python-abi \
python311-ply \
python311-setuptools"

inherit rpm
