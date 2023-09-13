SUMMARY = "The python pandas[hdf5] extra"
DESCRIPTION = "This package provides the [hdf5] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python311-pandas-hdf5-2.1.0-1.2.noarch.rpm"
RPM_HASH = "cd930a488a7102bf405adb467b438b568566fc5db4696aa222bdbd280696c5c4c6dfb9df1b38094d3fe794c8f21909a6b6706a9e0f3d5dcc04f657c9bf0a8c5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-hdf5 \
python311-pandas-hdf5"

RDEPENDS:${PN} += "python311-blosc \
python311-pandas \
python311-tables"

inherit rpm
