SUMMARY = "A Python module for JavaScript-like message boxes"
DESCRIPTION = "A pure Python module for JavaScript-like message boxes."
LICENSE = "BSD-3-Clause"

PV = "1.0.9"

RPM_NAME = "python310-PyMsgBox-1.0.9-1.3.noarch.rpm"
RPM_HASH = "c72c3faf20863f6073fe92eb18ee5fe9ef17b5b71c9d6253293565140f76f5027e297ca24ea39c9d155e6dfe5308ea7710fa07ba01ce5bbdbc81ddbaa18b24f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyMsgBox \
python3.10dist(pymsgbox) \
python310-PyMsgBox \
python3dist(pymsgbox)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
