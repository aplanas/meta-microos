SUMMARY = "The python pandas[compression] extra"
DESCRIPTION = "This package provides the [compression] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python311-pandas-compression-2.1.0-1.2.noarch.rpm"
RPM_HASH = "f5d7cbf10f0dbd10604c1a7df903d7f7f587454a2e837b4957fac948062c6395ca1bf345f7b09d42b7ceb13888afce27220127053f8d1e01bca289b52487636c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-compression \
python311-pandas-compression"

RDEPENDS:${PN} += "python311-pandas \
python311-zstandard"

inherit rpm
