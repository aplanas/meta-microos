SUMMARY = "Format a simple (i.e. not nested) list into aligned columns"
DESCRIPTION = "Format a simple (i.e. not nested) list into aligned columns."
LICENSE = "MIT"

PV = "0.3.11"

RPM_NAME = "python311-columnize-0.3.11-1.6.noarch.rpm"
RPM_HASH = "26ade0362a096b2ecf5335bacea83b044b01284fc8daf1cf08fb01b3e2cf339e1fc8e6cfda70a961282280132479676c8f8d35e63ad58308563d46e77e0b99e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-columnize \
python311-columnize \
python3dist-columnize"

RDEPENDS:${PN} += "python-abi"

inherit rpm
