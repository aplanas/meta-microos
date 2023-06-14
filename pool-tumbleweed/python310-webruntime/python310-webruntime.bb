SUMMARY = "A python package to launch HTML5 apps in the browser or a desktop-like runtime"
DESCRIPTION = "The webruntime module can be used to launch applications based on \
HTML/JS/CSS. This can be a browser or a runtime that looks like a \
desktop app, such as XUL (based on Firefox) or NW.js."
LICENSE = "BSD-2-Clause"

PV = "0.5.8"

RPM_NAME = "python310-webruntime-0.5.8-1.5.noarch.rpm"
RPM_HASH = "2f92af627d5c054a01726efd977162c9c942538f1311e34bbc3e5ce7d29341c476d2ab40dda4e362ca2d017f4bb49bd744d933960c74a2b9011184ba7b53bcb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-webruntime \
python3.10dist-webruntime \
python310-webruntime \
python3dist-webruntime"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-dialite \
update-alternatives"

inherit rpm
