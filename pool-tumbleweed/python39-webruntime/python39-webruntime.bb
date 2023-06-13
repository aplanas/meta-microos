SUMMARY = "A python package to launch HTML5 apps in the browser or a desktop-like runtime"
DESCRIPTION = "The webruntime module can be used to launch applications based on \
HTML/JS/CSS. This can be a browser or a runtime that looks like a \
desktop app, such as XUL (based on Firefox) or NW.js."
LICENSE = "BSD-2-Clause"

PV = "0.5.8"

RPM_NAME = "python39-webruntime-0.5.8-1.5.noarch.rpm"
RPM_HASH = "f4aa76e325e544d631491d5a88109a87906023190b116ac974139767501f393119bf83b3b1177444ef267bfba4661fb8595270a4d5ec141f2ecbb36e4a601d60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(webruntime) \
python39-webruntime \
python3dist(webruntime)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-dialite \
update-alternatives"

inherit rpm
