SUMMARY = "Pytest plugin for Django pluggable application testing"
DESCRIPTION = "A pytest plugin to help with Django pluggable application testing."
LICENSE = "BSD-3-Clause"

PV = "0.15.2"

RPM_NAME = "python39-pytest-djangoapp-0.15.2-2.7.noarch.rpm"
RPM_HASH = "290ade0326ed3828c4b49fe6d685154d9147dacb50eea417a205d0e493fc68ffb6cd38b809e62fa005db7049fe00eb6e9c7ecfeb96bb71b132c25d6081fef19a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-djangoapp) \
python39-pytest-djangoapp \
python3dist(pytest-djangoapp)"

RDEPENDS:${PN} += "python(abi) \
python39-Django \
python39-pytest"

inherit rpm
