SUMMARY = "Time-handling functionality from netcdf4-python"
DESCRIPTION = "Time-handling functionality from netcdf4-python. \
Was split out from netcfd4-python in 2016."
LICENSE = "MIT"

PV = "1.6.2"

RPM_NAME = "python311-cftime-1.6.2-1.7.aarch64.rpm"
RPM_HASH = "0b260b43026872de5af47eeaafa46763aa9cfa9dfa886d6cc95f0a3992b67c87c224ea5c9192b2472a1cc17d21cab1813351361a5db86d613be1c1c24cae39cc"

RPROVIDES:${PN} += "python3-cftime \
python3.11dist-cftime \
python311-cftime \
python3dist-cftime"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-Cython \
python311-numpy"

inherit rpm
