SUMMARY = "A GIT URL parser for Python"
DESCRIPTION = "git-url-parse is a GIT URL parser."
LICENSE = "MIT"

PV = "1.2.2"

RPM_NAME = "python310-git-url-parse-1.2.2-1.16.noarch.rpm"
RPM_HASH = "e97634db1820b109c25df258361c1d45ce2da69d578c376cd562d80bdec0aad11c5000be7bbe3e3e7dcc4c494627afdacdd0fa9db2b673dd9ae5786c02bc97e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-git-url-parse \
python310-git-url-parse \
python3dist-git-url-parse"

RDEPENDS:${PN} += "python-abi \
python310-pbr"

inherit rpm
