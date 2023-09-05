SUMMARY = "Python module for formatting Arabic sentences"
DESCRIPTION = "A module for reconstructing Arabic sentences that are to be used in \
applications that do not support Arabic."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python310-arabic-reshaper-3.0.0-2.1.noarch.rpm"
RPM_HASH = "ba22783d4ece4677870792461e48fe8510392cc82aa121b8d8fec750a1a50d4b337acb35fd90a2dcbf3065629b5c52ff768b1c21351b178d733607dd4b8cc66a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-arabic-reshaper \
python310-arabic-reshaper \
python3dist-arabic-reshaper"

RDEPENDS:${PN} += "python-abi"

inherit rpm
