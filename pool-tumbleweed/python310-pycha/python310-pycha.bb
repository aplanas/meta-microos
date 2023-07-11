SUMMARY = "A library for making charts with Python"
DESCRIPTION = "Pycha is a Python package for drawing charts using the Cairo library. \
It will not try to draw any possible chart on Earth, but draw the \
most common ones nicely. Pycha is based on the Plotr which is based on \
PlotKit, both of which are written in JavaScript and are for client \
web programming. Pycha was developed for the server side."
LICENSE = "LGPL-3.0-or-later"

PV = "0.8.1"

RPM_NAME = "python310-pycha-0.8.1-3.3.noarch.rpm"
RPM_HASH = "b69307a396eb413cdcd44d39a058c0910d8b1c9904044587284243213a59dc5c3efe7ae0ea052b50fc96c50af259523b0c97de94af7bc2e609fe446323f3fc11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pycha \
python310-pycha \
python3dist-pycha"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-cairocffi \
update-alternatives"

inherit rpm
