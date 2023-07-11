SUMMARY = "Data-Driven/Decorated Tests"
DESCRIPTION = "A library to multiply test cases."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python311-ddt-1.6.0-3.3.noarch.rpm"
RPM_HASH = "aa8ca588503f74084e3ea14f3be5ccdaad4dec61be9ee1c5b68909121863cd19569a46db83b6b990319a3d152a5b28a4ec9f0a7ecbdd3d73952999ba9b08cabd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ddt \
python3.11dist-ddt \
python311-ddt \
python3dist-ddt"

RDEPENDS:${PN} += "python-abi"

inherit rpm
