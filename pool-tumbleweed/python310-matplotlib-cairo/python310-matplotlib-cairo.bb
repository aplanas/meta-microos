SUMMARY = "Cairo backend for python310-matplotlib"
DESCRIPTION = "This package includes the non-interactive Cairo-based backend \
for the python310-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python310-matplotlib-cairo-3.6.3-3.1.aarch64.rpm"
RPM_HASH = "0ff14291a921807f6eb3279d21cb0d964758179caf4793dbaff6c661fa6ace06ebe63733c7294e3c2897d329523cc5e61648a75642740f861c485afe6da1da7a"

RPROVIDES:${PN} += "python310-matplotlib-cairo"

RDEPENDS:${PN} += "python-abi \
python310-cairo \
python310-matplotlib"

inherit rpm
