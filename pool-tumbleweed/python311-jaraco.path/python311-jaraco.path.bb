SUMMARY = "Miscellaneous path functions for jaraco packages"
DESCRIPTION = "jaraco.path provides cross platform hidden file detection \
and other miscellaneous path helper functions."
LICENSE = "MIT"

PV = "3.5.0"

RPM_NAME = "python311-jaraco.path-3.5.0-1.1.noarch.rpm"
RPM_HASH = "bcf0a74d03099bbc3d755f655a29865488c54f43960fc48e4449996715813387995b5a14e7138eebe1d2e7ca01af1f11b5f147782d1b3f28678e5634ed756bf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jaraco.path) \
python311-jaraco.path \
python3dist(jaraco.path)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
