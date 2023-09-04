SUMMARY = "The ASDF Standard schemas"
DESCRIPTION = "The ASDF Standard schemas"
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "python311-asdf-standard-1.0.3-2.1.noarch.rpm"
RPM_HASH = "3169bb76c4f83b1011a15fee93dfa1754b3c8e31605f354f2b052b45d38f2c59d58633dc364a039e55f6e839c97905943ec030f3b8dcf535bc255ca7ee23edab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asdf-standard \
python3.11dist-asdf-standard \
python311-asdf-standard \
python3dist-asdf-standard"

RDEPENDS:${PN} += "python-abi"

inherit rpm
