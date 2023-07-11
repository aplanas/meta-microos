SUMMARY = "A python package to launch HTML5 apps in the browser or a desktop-like runtime"
DESCRIPTION = "The webruntime module can be used to launch applications based on \
HTML/JS/CSS. This can be a browser or a runtime that looks like a \
desktop app, such as XUL (based on Firefox) or NW.js."
LICENSE = "BSD-2-Clause"

PV = "0.5.8"

RPM_NAME = "python311-webruntime-0.5.8-1.7.noarch.rpm"
RPM_HASH = "2156f1bdafe857d067634d49353d30f79530421cf23b957361445512ef20696cc1a8ad76adc4e0eb5c410b0503b81123fcf59893ae209a3503d660437106604b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-webruntime \
python3.11dist-webruntime \
python311-webruntime \
python3dist-webruntime"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-dialite \
update-alternatives"

inherit rpm
