SUMMARY = "Front-end component renderer for Dash"
DESCRIPTION = "Front-end component renderer for Dash."
LICENSE = "MIT"

PV = "1.9.1"

RPM_NAME = "python310-dash-renderer-1.9.1-1.11.noarch.rpm"
RPM_HASH = "9fe9dbea00f27686495b2785336f0107d7184a524205a399adcfd7d34b19ca53bb37ee03b623367c4bf30b801c66e570d4c1837c661f75a055ba83bb56acabff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-dash-renderer \
python310-dash-renderer \
python3dist-dash-renderer"

RDEPENDS:${PN} += "python-abi"

inherit rpm
