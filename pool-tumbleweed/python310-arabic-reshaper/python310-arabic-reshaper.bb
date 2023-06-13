SUMMARY = "Python module for formatting Arabic sentences"
DESCRIPTION = "A module for reconstructing Arabic sentences that are to be used in \
applications that do not support Arabic."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python310-arabic-reshaper-3.0.0-1.3.noarch.rpm"
RPM_HASH = "1c3253a7baa70235f8fb2b337cd851cd58827bc5f9d8fdf9b533d572635b73ea566305230b30176d1de72ea93b98e6f8b28791c9a81b3f12dea0af499ea7f1ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-arabic-reshaper \
python3.10dist(arabic-reshaper) \
python310-arabic-reshaper \
python3dist(arabic-reshaper)"

RDEPENDS:${PN} += "python(abi) \
python310-future"

inherit rpm
