SUMMARY = "Python REPL build on top of prompt_toolkit - IPython support"
DESCRIPTION = "Ptpython is an advanced Python REPL. \
 \
This package provides IPython support to Ptpython."
LICENSE = "ISC"

PV = "3.0.22"

RPM_NAME = "python311-ptpython-ptipython-3.0.22-1.6.noarch.rpm"
RPM_HASH = "6d354257b4d53638873f16abb9f4797cd065035324aa2932095790e61df75a51e53b997637ae6f55e734e0b291841ae14e39ecaa16a360928d4573c1e4ec9f00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ptpython-ptipython \
python311-ptpython-ptipython"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python311-ipython \
python311-ptpython"

inherit rpm
