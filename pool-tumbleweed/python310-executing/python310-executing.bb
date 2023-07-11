SUMMARY = "Get the currently executing AST node of a frame, and other information"
DESCRIPTION = "Get the currently executing AST node of a frame, and other information"
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python310-executing-1.2.0-2.3.noarch.rpm"
RPM_HASH = "a9d36b6735ab1d4e581a69c8f7c518a19655efd533d33544977524e41631702498bd0c74f0a85cf7dc1ff1711922a61f8c573c0886ea50985e73175b32d69207"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-executing \
python310-executing \
python3dist-executing"

RDEPENDS:${PN} += "python-abi"

inherit rpm
