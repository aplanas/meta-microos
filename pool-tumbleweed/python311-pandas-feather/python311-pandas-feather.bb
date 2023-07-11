SUMMARY = "The python pandas[feather] extra"
DESCRIPTION = "This package provides the [feather] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python311-pandas-feather-2.0.2-4.1.noarch.rpm"
RPM_HASH = "2edfcf9d1e9becfe1756db14cf3c03bff5eb58a3705145eeb1412d36010587628dc89e3e69672d521f80db7edb2c04a5c488c60c84aab643ea2c787b147ac66f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-feather \
python311-pandas-feather"

RDEPENDS:${PN} += "python311-pandas \
python311-pyarrow"

inherit rpm
