SUMMARY = "Front-end component renderer for Dash"
DESCRIPTION = "Front-end component renderer for Dash."
LICENSE = "MIT"

PV = "1.9.1"

RPM_NAME = "python311-dash-renderer-1.9.1-1.11.noarch.rpm"
RPM_HASH = "8fbe39bc361c4f6db64b0ef84d38ad42ccc0012189c383e275111626eb4b19935b66194220a0be7c6277294d74817ac3fe7834c1d7eadbb1789292c120604903"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dash-renderer \
python3.11dist-dash-renderer \
python311-dash-renderer \
python3dist-dash-renderer"

RDEPENDS:${PN} += "python-abi"

inherit rpm
