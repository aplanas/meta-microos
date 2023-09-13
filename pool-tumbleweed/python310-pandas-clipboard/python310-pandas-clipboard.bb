SUMMARY = "The python pandas[clipboard] extra"
DESCRIPTION = "This package provides the [clipboard] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python310-pandas-clipboard-2.1.0-1.2.noarch.rpm"
RPM_HASH = "9b1a15a04508e84f85bc6ef1de3a0b7c81618a9ce6837518957a17aa1d80484175eea47d07006305915218f82ef75c95f0f1fd4ff90948fdb60d5b55eb2ec055"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-clipboard"

RDEPENDS:${PN} += "python310-PyQt5 \
python310-QtPy \
python310-pandas"

inherit rpm
