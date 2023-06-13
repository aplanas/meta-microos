SUMMARY = "Module to diff JSON and JSON-like structures in Python"
DESCRIPTION = "Package to show differences between JSON and JSON-like structures in Python"
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-jsondiff-2.0.0-1.6.noarch.rpm"
RPM_HASH = "4ccba1679ce1cdce3828a912526197fdf3bd51348236017686d2158d35fe8a71beaf06ee5f75f186dbe04be97e9f8a9c9b07755aa74f626397ea61c52add8129"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jsondiff) \
python311-jsondiff \
python3dist(jsondiff)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-setuptools \
update-alternatives"

inherit rpm
