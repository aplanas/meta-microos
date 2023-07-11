SUMMARY = "Format a simple (i.e. not nested) list into aligned columns"
DESCRIPTION = "Format a simple (i.e. not nested) list into aligned columns."
LICENSE = "MIT"

PV = "0.3.11"

RPM_NAME = "python39-columnize-0.3.11-1.8.noarch.rpm"
RPM_HASH = "9814812561bda35e03bc488de132365815d142e3ed894fc3d01d525d84646d317991dbfcd9472b815203925d95b9f4c52acd86559a5ca7b55dc44b84e22a9e24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-columnize \
python39-columnize \
python3dist-columnize"

RDEPENDS:${PN} += "python-abi"

inherit rpm
