SUMMARY = "A python package to launch HTML5 apps in the browser or a desktop-like runtime"
DESCRIPTION = "The webruntime module can be used to launch applications based on \
HTML/JS/CSS. This can be a browser or a runtime that looks like a \
desktop app, such as XUL (based on Firefox) or NW.js."
LICENSE = "BSD-2-Clause"

PV = "0.5.8"

RPM_NAME = "python310-webruntime-0.5.8-1.7.noarch.rpm"
RPM_HASH = "ec49c471668901d3cdf3e2d61ed50b3bc7c67f16187f6f90410172f5f7b6ac546e16f174c6304defea9e56efe58ac922bd7367a405d20ceb50515f228356e0b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-webruntime \
python310-webruntime \
python3dist-webruntime"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-dialite \
update-alternatives"

inherit rpm
