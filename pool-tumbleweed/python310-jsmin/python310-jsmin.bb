SUMMARY = "JavaScript minifier"
DESCRIPTION = "JavaScript minifier."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python310-jsmin-3.0.1-1.8.noarch.rpm"
RPM_HASH = "fc6ce90661b8c8df6979fdb64b344f4c643e8c4543157c4c0d966fbcfacf2f9e223e93209b9beee821a44c628ad4312b2fd8f790c3404a88357483c3844b5e4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jsmin \
python310-jsmin \
python3dist-jsmin"

RDEPENDS:${PN} += "python-abi"

inherit rpm
