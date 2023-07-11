SUMMARY = "Productivity Tools for Plotly + Pandas"
DESCRIPTION = "This library binds the plotly with pandas for plotting."
LICENSE = "MIT"

PV = "0.17.3"

RPM_NAME = "python311-cufflinks-0.17.3-3.10.noarch.rpm"
RPM_HASH = "3807cabca4e1f3221e7b993cdfbc161091150f2ef8227ea9f1d5830d2d19015d00fd729214088d0cc8ec0d5adb4de2e363d718d07e8a7d447271cddc5fc88f50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cufflinks \
python3.11dist-cufflinks \
python311-cufflinks \
python3dist-cufflinks"

RDEPENDS:${PN} += "python-abi \
python311-colorlover \
python311-numpy \
python311-pandas \
python311-plotly \
python311-six"

inherit rpm
