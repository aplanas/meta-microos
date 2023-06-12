SUMMARY = "Intelligent predictive wxPython text editor"
DESCRIPTION = "This package contains the wxPython predictive text editor pyprompter. \
 \
pyprompter is a cross-platform predictive text editor. \
 \
pyprompter displays predictions in a contextual pop-up box as each letter is typed. Predictions can be easily selected and inserted in the document."
LICENSE = "GPL-2.0-only"

PV = "0.9.1"

RPM_NAME = "python3-pyprompter-0.9.1-13.1.noarch.rpm"
RPM_HASH = "89d8fda9ceafb06be4d11606a4b24cbdc1a2c9752c5085d2c8cbdb2c8cc9a162894a3b03599eb38cabf4904c65e89baedfd6fe5d6dc2a8bf373d1d09bac3e540"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(pyprompter.desktop) \
pyprompter \
python3-pyprompter \
python3.10dist(pyprompter) \
python3dist(pyprompter)"
RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
python3-presage \
python3-wxPython"

inherit rpm
