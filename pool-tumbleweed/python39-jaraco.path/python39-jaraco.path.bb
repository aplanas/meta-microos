SUMMARY = "Miscellaneous path functions for jaraco packages"
DESCRIPTION = "jaraco.path provides cross platform hidden file detection \
and other miscellaneous path helper functions."
LICENSE = "MIT"

PV = "3.5.0"

RPM_NAME = "python39-jaraco.path-3.5.0-1.3.noarch.rpm"
RPM_HASH = "b40fc669931aab918c3113a4d24ee111278b5722e37da5f874bae5e1e7ea4bc4ccd84928d2579b932b24587ea29aab76a961c3c0a558c3b063fe8c88a1fd13c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jaraco.path \
python39-jaraco.path \
python3dist-jaraco.path"

RDEPENDS:${PN} += "python-abi"

inherit rpm
