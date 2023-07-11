SUMMARY = "Get the currently executing AST node of a frame, and other information"
DESCRIPTION = "Get the currently executing AST node of a frame, and other information"
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python39-executing-1.2.0-2.3.noarch.rpm"
RPM_HASH = "db1615fcc49400bef28913c1c3eff030e0e2761259d250e97f9a3fed2801bb52dcd10e335e1cdf31242e9957a04ddbc83f9765d4a51729491b81452ef1bdb380"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-executing \
python39-executing \
python3dist-executing"

RDEPENDS:${PN} += "python-abi"

inherit rpm
