SUMMARY = "The ASDF Standard schemas"
DESCRIPTION = "The ASDF Standard schemas"
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "python310-asdf-standard-1.0.3-2.1.noarch.rpm"
RPM_HASH = "4e834fa515352bf7873b7a8946fa4ba48c245062b22296fea0ccf76024d71f75281a7b1771e12c36c60302e1d716a3ec0baecd4ea999f75c0a7dea42ec9407fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-asdf-standard \
python310-asdf-standard \
python3dist-asdf-standard"

RDEPENDS:${PN} += "python-abi"

inherit rpm
