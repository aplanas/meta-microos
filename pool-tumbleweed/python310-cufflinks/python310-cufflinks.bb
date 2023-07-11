SUMMARY = "Productivity Tools for Plotly + Pandas"
DESCRIPTION = "This library binds the plotly with pandas for plotting."
LICENSE = "MIT"

PV = "0.17.3"

RPM_NAME = "python310-cufflinks-0.17.3-3.10.noarch.rpm"
RPM_HASH = "e118e99e5505cfc65a65fe48f8490d60027e81a262a83e3b44680d9aed0c0d6c375dc3d6eeb40da544139205ecd3f227ed9de351a8474a375a10e92d91cf0239"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cufflinks \
python310-cufflinks \
python3dist-cufflinks"

RDEPENDS:${PN} += "python-abi \
python310-colorlover \
python310-numpy \
python310-pandas \
python310-plotly \
python310-six"

inherit rpm
