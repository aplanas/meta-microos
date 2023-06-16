SUMMARY = "Python REPL build on top of prompt_toolkit - IPython support"
DESCRIPTION = "Ptpython is an advanced Python REPL. \
 \
This package provides IPython support to Ptpython."
LICENSE = "ISC"

PV = "3.0.22"

RPM_NAME = "python39-ptpython-ptipython-3.0.22-1.4.noarch.rpm"
RPM_HASH = "cbbd8cec46b2c85c28a3b21737e68436f799544d43fd5a7de1f13807c0af5d98d686592131ccfc16a04f3e4d055f9ce37a4a9f11f8071fd6e49b20ff1bb0ba80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-ptpython-ptipython"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python39-ipython \
python39-ptpython"

inherit rpm
