SUMMARY = "Python libraries for NDTiff datasets"
DESCRIPTION = "Python libraries for NDTiff datasets"
LICENSE = "BSD-3-Clause"

PV = "1.12.0"

RPM_NAME = "python311-ndtiff-1.12.0-1.3.noarch.rpm"
RPM_HASH = "25b49801ee498714b52a962e4de781a9788012c567735f8dde31e3a6814dd88689f4aa81c580bbb9723dca19a368a1040d419fb312693fff13caeca2f0b0c1c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ndtiff \
python3.11dist-ndtiff \
python311-ndtiff \
python3dist-ndtiff"

RDEPENDS:${PN} += "python-abi \
python311-dask-array \
python311-numpy"

inherit rpm
