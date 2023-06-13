SUMMARY = "Compatibility shims for pip versions 8 thru current"
DESCRIPTION = "Compatibility shims for pip versions 8 thru current."
LICENSE = "ISC"

PV = "0.7.3"

RPM_NAME = "python310-pip-shims-0.7.3-1.3.noarch.rpm"
RPM_HASH = "f6158d72b1cebb45b9adaef583810df1165e9e115b72b379f4046a84080d71a4110059b4a1e7ce40c48d8deb8782dc3094ddff1de0c9381f85c9f15603f64940"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pip-shims \
python3.10dist(pip-shims) \
python310-pip-shims \
python3dist(pip-shims)"

RDEPENDS:${PN} += "python(abi) \
python310-pip \
python310-setuptools \
python310-wheel"

inherit rpm
