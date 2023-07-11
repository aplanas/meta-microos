SUMMARY = "The python pandas[compression] extra"
DESCRIPTION = "This package provides the [compression] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python311-pandas-compression-2.0.2-4.1.noarch.rpm"
RPM_HASH = "d3a05e1d9d81b1168aaa8503fe0a08a5f90b7d3af5d78692643109b090a55d6f29b3af6015c1eaa39aebc605034415995c2be2f9eee060630946abe353755034"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-compression \
python311-pandas-compression"

RDEPENDS:${PN} += "python311-brotlipy \
python311-pandas \
python311-python-snappy \
python311-zstandard"

inherit rpm
