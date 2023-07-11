SUMMARY = "Operating system virtual terminal plugin for the Spyder IDE"
DESCRIPTION = "Spyder, the Scientific Python Development Environment, is an \
IDE for researchers, engineers and data analysts. \
 \
This package contains the plugin for displaying a virtual terminal \
(OS independent) inside the main Spyder window. It uses a nodejs \
backend."
LICENSE = "MIT"

PV = "1.2.2"

RPM_NAME = "python3-spyder-terminal-1.2.2-1.4.noarch.rpm"
RPM_HASH = "1c01cfd2a0d2eab40d50e2e456acf6c76116c6c1631653e6c84ed579af78c5e61f6d3ed2ce35291fd0444b7be03ecc9af2cd1309f39594e7c465b1a490d539e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-spyder-terminal \
python3.11dist-spyder-terminal \
python3dist-spyder-terminal \
spyder-terminal \
spyder3-terminal"

RDEPENDS:${PN} += "/usr/bin/env \
python-abi \
python3-coloredlogs \
python3-requests \
python3-terminado \
python3-tornado \
spyder"

inherit rpm
