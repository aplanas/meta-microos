SUMMARY = "A Python module for JavaScript-like message boxes"
DESCRIPTION = "A pure Python module for JavaScript-like message boxes."
LICENSE = "BSD-3-Clause"

PV = "1.0.9"

RPM_NAME = "python39-PyMsgBox-1.0.9-1.4.noarch.rpm"
RPM_HASH = "e8143f80635c9fa0abc6a40ec7b4d800d2cda81a6610ffdd370d2c151c10328ae4401a83de38111484640196957a76b89e2980829beec412b01fcb24bd51365b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pymsgbox \
python39-PyMsgBox \
python3dist-pymsgbox"

RDEPENDS:${PN} += "python-abi"

inherit rpm
