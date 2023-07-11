SUMMARY = "Miscellaneous path functions for jaraco packages"
DESCRIPTION = "jaraco.path provides cross platform hidden file detection \
and other miscellaneous path helper functions."
LICENSE = "MIT"

PV = "3.5.0"

RPM_NAME = "python310-jaraco.path-3.5.0-1.3.noarch.rpm"
RPM_HASH = "681db340a493d12b7485399800001a374a53f13ecf93ca8b40701d840dd387e8c0c42f816e22add372c16fb432a9b52ddd6f362bb4fc4746ad8db831a5bf4969"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jaraco.path \
python310-jaraco.path \
python3dist-jaraco.path"

RDEPENDS:${PN} += "python-abi"

inherit rpm
