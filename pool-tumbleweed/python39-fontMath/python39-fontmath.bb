SUMMARY = "A set of objects for performing math operations on font data"
DESCRIPTION = "A set of objects for performing math operations on font data."
LICENSE = "MIT"

PV = "0.9.3"

RPM_NAME = "python39-fontMath-0.9.3-1.5.noarch.rpm"
RPM_HASH = "7f993d4f1190744ad86bbc46db2e0da2b65bce7de5b0215c80a42a395d6422911685662ad7338ab40c62046766669703f48c87cb86c2de00e790922e94544525"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-fontmath \
python39-fontMath \
python3dist-fontmath"

RDEPENDS:${PN} += "python-abi \
python39-FontTools"

inherit rpm
