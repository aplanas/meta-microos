SUMMARY = "Promises/A+ implementation for Python"
DESCRIPTION = "This is an implementation of Promises in Python"
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python310-promise-2.3.0-5.1.noarch.rpm"
RPM_HASH = "aa1723f07d753b179559a21e25c00c1f764097d35b0512008cf3cab5fabf8967f613db4c2f6b105b8604051ff35ab712f78da274884e4a82534d0e52dfe1a5bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-promise \
python310-promise \
python3dist-promise"

RDEPENDS:${PN} += "python-abi"

inherit rpm
