SUMMARY = "Python module for converting a dictionary to XML"
DESCRIPTION = "This module converts a Python dictionary or other native data type \
into a valid XML string."
LICENSE = "GPL-2.0-only"

PV = "1.7.16"

RPM_NAME = "python310-dicttoxml-1.7.16-1.4.noarch.rpm"
RPM_HASH = "7a6b073a5bf700c3bc69831e45baa9db7e00042bf169f4dd7be5d6ddc197a3f12f2c91f7fc38a9e22a8e944b741d3bfea8849fb0a723cc52f261431bf988f4d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-dicttoxml \
python310-dicttoxml \
python3dist-dicttoxml"

RDEPENDS:${PN} += "python-abi"

inherit rpm
