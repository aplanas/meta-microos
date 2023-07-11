SUMMARY = "Python REPL build on top of prompt_toolkit - IPython support"
DESCRIPTION = "Ptpython is an advanced Python REPL. \
 \
This package provides IPython support to Ptpython."
LICENSE = "ISC"

PV = "3.0.22"

RPM_NAME = "python310-ptpython-ptipython-3.0.22-1.6.noarch.rpm"
RPM_HASH = "93937bb3af04fa4e64748a164e51ec9cd4e2d006f665f53f6e83218acf93130dcc3199c5ff763bf0a13bd7414e4f715216f5268467b777c80a41d6efb46f33e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-ptpython-ptipython"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python310-ipython \
python310-ptpython"

inherit rpm
