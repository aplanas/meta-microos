SUMMARY = "A python package to launch HTML5 apps in the browser or a desktop-like runtime"
DESCRIPTION = "The webruntime module can be used to launch applications based on \
HTML/JS/CSS. This can be a browser or a runtime that looks like a \
desktop app, such as XUL (based on Firefox) or NW.js."
LICENSE = "BSD-2-Clause"

PV = "0.5.8"

RPM_NAME = "python311-webruntime-0.5.8-1.5.noarch.rpm"
RPM_HASH = "cc391a2d2ef74890c793e6baefad333fbf9e28876c1fe1e274823f3e56129aed6ef46af7a40af0368686a49bb48e90cb3e6984d9c327b22b52d1b6748dc8b955"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(webruntime) \
python311-webruntime \
python3dist(webruntime)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-dialite \
update-alternatives"

inherit rpm
