SUMMARY = "Reproject astronomical images"
DESCRIPTION = "Reproject astronomical images"
LICENSE = "BSD-3-Clause"

PV = "0.9.1"

RPM_NAME = "python39-reproject-0.9.1-1.7.aarch64.rpm"
RPM_HASH = "8d89cd9a916862f129c9a80763d99696defe006d74690a17a13725fb5fd4d91ebcb26b65a4738395a224b0d18b8f127b05b3ce74b484f39c8b77a46b8e05894e"

RPROVIDES:${PN} += "python3.9dist-reproject \
python39-reproject \
python3dist-reproject"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-astropy \
python39-astropy-healpix \
python39-numpy \
python39-scipy"

inherit rpm
