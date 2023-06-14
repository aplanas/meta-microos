SUMMARY = "A library for making charts with Python"
DESCRIPTION = "Pycha is a Python package for drawing charts using the Cairo library. \
It will not try to draw any possible chart on Earth, but draw the \
most common ones nicely. Pycha is based on the Plotr which is based on \
PlotKit, both of which are written in JavaScript and are for client \
web programming. Pycha was developed for the server side."
LICENSE = "LGPL-3.0-or-later"

PV = "0.8.1"

RPM_NAME = "python39-pycha-0.8.1-3.1.noarch.rpm"
RPM_HASH = "04848ad59b07e10f4879074577153b391dac572f9f30cc3e4c0171dec18c0fd854b30038bce6d577770181c4b13922ca294026090e6d001445b8f21d405c7d07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pycha \
python39-pycha \
python3dist-pycha"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-cairocffi \
update-alternatives"

inherit rpm
