SUMMARY = "The python pandas[compression] extra"
DESCRIPTION = "This package provides the [compression] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python311-pandas-compression-2.0.3-1.2.noarch.rpm"
RPM_HASH = "3a03e449d53c48f872f37d2d058e6b878c9ff35cea87b45ddc327b9c7918774ab89124a5e74d3d8980b79b62eef074b279dd2b354a256886080f3292aaf481e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-compression \
python311-pandas-compression"

RDEPENDS:${PN} += "python311-brotlipy \
python311-pandas \
python311-python-snappy \
python311-zstandard"

inherit rpm
