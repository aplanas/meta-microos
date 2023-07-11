SUMMARY = "URL normalization for Python"
DESCRIPTION = "URL normalization for Python."
LICENSE = "MIT"

PV = "1.4.3"

RPM_NAME = "python39-url-normalize-1.4.3-2.3.noarch.rpm"
RPM_HASH = "9d617e6415732f01c71ca6363eac019e3ebf5eecfebf1e9715019182a0d98ae57986002683b6e73b4da3973708f83d1c0329264ddae8924d9adacf5c232bc6a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-url-normalize \
python39-url-normalize \
python3dist-url-normalize"

RDEPENDS:${PN} += "python-abi \
python39-six"

inherit rpm
