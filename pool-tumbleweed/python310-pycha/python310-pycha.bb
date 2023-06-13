SUMMARY = "A library for making charts with Python"
DESCRIPTION = "Pycha is a Python package for drawing charts using the Cairo library. \
It will not try to draw any possible chart on Earth, but draw the \
most common ones nicely. Pycha is based on the Plotr which is based on \
PlotKit, both of which are written in JavaScript and are for client \
web programming. Pycha was developed for the server side."
LICENSE = "LGPL-3.0-or-later"

PV = "0.8.1"

RPM_NAME = "python310-pycha-0.8.1-3.1.noarch.rpm"
RPM_HASH = "6503206bc6f2f01bd4e64c35bf9d00b86b022f0e2c265824f50d9ca57f7ac7ce1eae1f546a2ce0ea42790e09c49ab5b36ed3bf2c6363c85357e6f2ea81931a62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pycha \
python3.10dist(pycha) \
python310-pycha \
python3dist(pycha)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-cairocffi \
update-alternatives"

inherit rpm
