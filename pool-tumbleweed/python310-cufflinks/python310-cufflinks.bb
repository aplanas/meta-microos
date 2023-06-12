SUMMARY = "Productivity Tools for Plotly + Pandas"
DESCRIPTION = "This library binds the plotly with pandas for plotting."
LICENSE = "MIT"

PV = "0.17.3"

RPM_NAME = "python310-cufflinks-0.17.3-3.8.noarch.rpm"
RPM_HASH = "0f526ead2b2f8a5251fca4a96c2089058cca8c1575738ac63aedb58cd8d304331010cb07e5e6c978fa3252cbf42d02fadad9101977cd757582e618f574d2293c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cufflinks \
python3.10dist(cufflinks) \
python310-cufflinks \
python3dist(cufflinks)"
RDEPENDS:${PN} += "python(abi) \
python310-colorlover \
python310-numpy \
python310-pandas \
python310-plotly \
python310-six"

inherit rpm
