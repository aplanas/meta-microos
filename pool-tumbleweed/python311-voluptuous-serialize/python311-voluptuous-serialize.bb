SUMMARY = "Python module to convert voluptuous schemas to dictionaries"
DESCRIPTION = "A Python module to convert voluptuous schemas to dictionaries."
LICENSE = "Apache-2.0"

PV = "2.5.0"

RPM_NAME = "python311-voluptuous-serialize-2.5.0-1.3.noarch.rpm"
RPM_HASH = "2e0a361781d50b6bdd148738ee8d77191000d7d66466d4cbf6f338d725cdb0d965af14d18f8e6d45a6581bb29e8923e78e2246f30a83a2f4c14d82b48b17cd0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(voluptuous-serialize) \
python311-voluptuous-serialize \
python3dist(voluptuous-serialize)"
RDEPENDS:${PN} += "python(abi) \
python311-voluptuous"

inherit rpm
