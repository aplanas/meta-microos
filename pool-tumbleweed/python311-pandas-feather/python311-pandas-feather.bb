SUMMARY = "The python pandas[feather] extra"
DESCRIPTION = "This package provides the [feather] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python311-pandas-feather-2.0.3-1.3.noarch.rpm"
RPM_HASH = "0c2193df1d3529b343c738ea2faf4a88282197c4eda42df8c64251c827a75e637c7c49ecb917d1e771d1f57cfd8f9c401c97ab63ced3387e5abc15f8b24bcb19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-feather \
python311-pandas-feather"

RDEPENDS:${PN} += "python311-pandas \
python311-pyarrow"

inherit rpm
