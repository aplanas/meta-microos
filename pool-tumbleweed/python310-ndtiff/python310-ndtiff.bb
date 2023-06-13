SUMMARY = "Python libraries for NDTiff datasets"
DESCRIPTION = "Python libraries for NDTiff datasets"
LICENSE = "BSD-3-Clause"

PV = "1.12.0"

RPM_NAME = "python310-ndtiff-1.12.0-1.1.noarch.rpm"
RPM_HASH = "473fac01e0767c3cf353bca634fd54669543dd977c018966380ec3fef6f3589353c151aee9f89fd5c89f15ddfdb6d024c834a3c606122479938c7e477243b6c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ndtiff \
python3.10dist(ndtiff) \
python310-ndtiff \
python3dist(ndtiff)"

RDEPENDS:${PN} += "python(abi) \
python310-dask-array \
python310-numpy"

inherit rpm
