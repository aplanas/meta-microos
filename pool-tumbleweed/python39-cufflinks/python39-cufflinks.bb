SUMMARY = "Productivity Tools for Plotly + Pandas"
DESCRIPTION = "This library binds the plotly with pandas for plotting."
LICENSE = "MIT"

PV = "0.17.3"

RPM_NAME = "python39-cufflinks-0.17.3-3.10.noarch.rpm"
RPM_HASH = "d1799ce08c74be29557ec538985174f42310904609e9ed8e7f0a3b26559a7dff5a1efb8ff97e646117a03a0354920617f4e07ca8f12f14523ac78b352adc2b9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cufflinks \
python39-cufflinks \
python3dist-cufflinks"

RDEPENDS:${PN} += "python-abi \
python39-colorlover \
python39-numpy \
python39-pandas \
python39-plotly \
python39-six"

inherit rpm
