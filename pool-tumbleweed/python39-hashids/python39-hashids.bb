SUMMARY = "Python implementation of hashids"
DESCRIPTION = "Python implementation of hashids (http://www.hashids.org)."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "python39-hashids-1.3.1-1.18.noarch.rpm"
RPM_HASH = "17fdb444fbe48b5356277bb138f154664bb39338f7efcc962f1dda740a9c49a704ac65f3a5e02891fef82e6b957e48d48d312548cf687f7a782e893490e36b31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-hashids \
python39-hashids \
python3dist-hashids"

RDEPENDS:${PN} += "python-abi"

inherit rpm
