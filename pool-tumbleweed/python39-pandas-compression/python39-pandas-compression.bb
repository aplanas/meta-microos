SUMMARY = "The python pandas[compression] extra"
DESCRIPTION = "This package provides the [compression] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python39-pandas-compression-2.0.3-1.3.noarch.rpm"
RPM_HASH = "900dc73c4b4497d466adc00a628b0f8e69ff9861237fe219f0c729a1fc6e67ac6c37d2f5beb48481a55fcb5aaa907410356c7397f33236f542321feb6f3aee3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-compression"

RDEPENDS:${PN} += "python39-brotlipy \
python39-pandas \
python39-python-snappy \
python39-zstandard"

inherit rpm
