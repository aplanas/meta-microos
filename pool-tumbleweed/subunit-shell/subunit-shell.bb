SUMMARY = "Shell bindings for subunit"
DESCRIPTION = "Subunit shell bindings.  See the python3-python-subunit package for test \
processing functionality."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "subunit-shell-1.4.2-3.2.noarch.rpm"
RPM_HASH = "fa9e13585d733fc1748d77b9f25b27d4febfba6b256d6d8982c92101cdf8b0d8de8c73da61241bbb993e0bbe6adc18907d35eeaa390d449b5dcc9ab33e01c49a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-subunit-shell \
subunit-shell"

RDEPENDS:${PN} += ""

inherit rpm
