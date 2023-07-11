SUMMARY = "A python package to launch HTML5 apps in the browser or a desktop-like runtime"
DESCRIPTION = "The webruntime module can be used to launch applications based on \
HTML/JS/CSS. This can be a browser or a runtime that looks like a \
desktop app, such as XUL (based on Firefox) or NW.js."
LICENSE = "BSD-2-Clause"

PV = "0.5.8"

RPM_NAME = "python39-webruntime-0.5.8-1.7.noarch.rpm"
RPM_HASH = "c56cd79c2cc93df09b75970b8a3c40f5c3bbc0fab0b1d84c6f1b8fb9ba63dd890edf318ce7396c367b2e18dddf3305e9069911b0155168d31eea7d4e6556660b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-webruntime \
python39-webruntime \
python3dist-webruntime"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-dialite \
update-alternatives"

inherit rpm
