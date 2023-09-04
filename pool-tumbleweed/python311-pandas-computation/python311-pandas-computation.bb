SUMMARY = "The python pandas[computation] extra"
DESCRIPTION = "This package provides the [computation] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python311-pandas-computation-2.0.3-1.2.noarch.rpm"
RPM_HASH = "6a182dfe77c5a8231983d69774539f21ac3348ed7aade3b630e64b9bdf91313d22bf31886716fc1702e397b0b1b6f63a239fb44494b4cd3d7549b07e4549112f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-computation \
python311-pandas-computation"

RDEPENDS:${PN} += "python311-pandas \
python311-scipy \
python311-xarray"

inherit rpm
