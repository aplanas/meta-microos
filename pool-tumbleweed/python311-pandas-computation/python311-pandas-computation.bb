SUMMARY = "The python pandas[computation] extra"
DESCRIPTION = "This package provides the [computation] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python311-pandas-computation-2.0.2-4.1.noarch.rpm"
RPM_HASH = "7d71b0503e09ca02aab5f08545ebbaed3afb612937b3eacd74d09aca657aecf810220b45dd3b647040ba0add307324d244823ca7b327e3495e83c5f108a2d52f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-computation \
python311-pandas-computation"

RDEPENDS:${PN} += "python311-pandas \
python311-scipy \
python311-xarray"

inherit rpm
