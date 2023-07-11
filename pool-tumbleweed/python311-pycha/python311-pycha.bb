SUMMARY = "A library for making charts with Python"
DESCRIPTION = "Pycha is a Python package for drawing charts using the Cairo library. \
It will not try to draw any possible chart on Earth, but draw the \
most common ones nicely. Pycha is based on the Plotr which is based on \
PlotKit, both of which are written in JavaScript and are for client \
web programming. Pycha was developed for the server side."
LICENSE = "LGPL-3.0-or-later"

PV = "0.8.1"

RPM_NAME = "python311-pycha-0.8.1-3.3.noarch.rpm"
RPM_HASH = "be65cb646b1d8e83dfd5b9e83b8f61d7ece1e1fb322045c91524c98e79407990cc3fd483b9ceee2d0404d608622e59dae9b24c906fc63301e8cf8f026fa4bec5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pycha \
python3.11dist-pycha \
python311-pycha \
python3dist-pycha"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-cairocffi \
update-alternatives"

inherit rpm
