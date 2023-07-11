SUMMARY = "Data files for STK, a music synthesis library"
DESCRIPTION = "Data files for STK."
LICENSE = "MIT"

PV = "4.6.2"

RPM_NAME = "stk-data-4.6.2-1.4.noarch.rpm"
RPM_HASH = "a795c078cb8460a91758fd4a175d4b1cfd6129c66b00e5f789f0823e63128d921c5efa5e9cdd94579831ec1c6425400915521ddbbc871b15df0ea2726c1a329e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "stk-data"

RDEPENDS:${PN} += ""

inherit rpm
