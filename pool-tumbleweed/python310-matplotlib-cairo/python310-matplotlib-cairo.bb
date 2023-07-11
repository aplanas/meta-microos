SUMMARY = "Cairo backend for python310-matplotlib"
DESCRIPTION = "This package includes the non-interactive Cairo-based backend \
for the python310-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python310-matplotlib-cairo-3.6.3-2.3.aarch64.rpm"
RPM_HASH = "81d9dd5fe87b820eba2f92d5c01f91fdeee162d48a96e005b75e80d258b8001d51791764f605782f939edf4f77fb08e5372fcfd24fcc8d3800ad79570ed524e8"

RPROVIDES:${PN} += "python310-matplotlib-cairo"

RDEPENDS:${PN} += "python-abi \
python310-cairo \
python310-matplotlib"

inherit rpm
