SUMMARY = "An immutable URL class for URL building and manipulation"
DESCRIPTION = "An immutable URL class for URL building and manipulation."
LICENSE = "MIT"

PV = "1.6"

RPM_NAME = "python311-purl-1.6-2.3.noarch.rpm"
RPM_HASH = "c901e2a98fa91e32c6acafc09e32f779ecaf745a5baa6901f2584e8871e987de2fb29696964e32845a624dd2a88c7fec5416798e47d750b231585e21c64eba94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-purl \
python3.11dist-purl \
python311-purl \
python3dist-purl"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
