SUMMARY = "Productivity Tools for Plotly + Pandas"
DESCRIPTION = "This library binds the plotly with pandas for plotting."
LICENSE = "MIT"

PV = "0.17.3"

RPM_NAME = "python311-cufflinks-0.17.3-3.8.noarch.rpm"
RPM_HASH = "75861f90b0b1eec321162174cd88bdd26b73523c36c93bcfe7a9170e23399041bfcc505c22e686e276b1d60354daf40c2cd80abb2157549f4334ea794863e5e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-cufflinks \
python311-cufflinks \
python3dist-cufflinks"

RDEPENDS:${PN} += "python-abi \
python311-colorlover \
python311-numpy \
python311-pandas \
python311-plotly \
python311-six"

inherit rpm
