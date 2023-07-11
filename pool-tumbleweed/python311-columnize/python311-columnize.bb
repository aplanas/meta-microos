SUMMARY = "Format a simple (i.e. not nested) list into aligned columns"
DESCRIPTION = "Format a simple (i.e. not nested) list into aligned columns."
LICENSE = "MIT"

PV = "0.3.11"

RPM_NAME = "python311-columnize-0.3.11-1.8.noarch.rpm"
RPM_HASH = "e0e469baf6c612e260314c366baf61cbb5e4a0669bf9500bd4bab2844ca71c909b1b968f7040dc9de38d97785298ca23610bb0ccb23763a3e8f35c1825c837b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-columnize \
python3.11dist-columnize \
python311-columnize \
python3dist-columnize"

RDEPENDS:${PN} += "python-abi"

inherit rpm
