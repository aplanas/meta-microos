SUMMARY = "A library for making charts with Python"
DESCRIPTION = "Pycha is a Python package for drawing charts using the Cairo library. \
It will not try to draw any possible chart on Earth, but draw the \
most common ones nicely. Pycha is based on the Plotr which is based on \
PlotKit, both of which are written in JavaScript and are for client \
web programming. Pycha was developed for the server side."
LICENSE = "LGPL-3.0-or-later"

PV = "0.8.1"

RPM_NAME = "python39-pycha-0.8.1-3.3.noarch.rpm"
RPM_HASH = "2a4cbb1caf9ba55b8ef868acb76113da5d579fce16eb1a1fd2edd133c441c50a8cc626fd8ec8947a3100dc2d92c7ca68479c22d9eba4511ad6fd81f33883c518"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pycha \
python39-pycha \
python3dist-pycha"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-cairocffi \
update-alternatives"

inherit rpm
