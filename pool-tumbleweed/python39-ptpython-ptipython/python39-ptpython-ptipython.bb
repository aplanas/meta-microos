SUMMARY = "Python REPL build on top of prompt_toolkit - IPython support"
DESCRIPTION = "Ptpython is an advanced Python REPL. \
 \
This package provides IPython support to Ptpython."
LICENSE = "ISC"

PV = "3.0.22"

RPM_NAME = "python39-ptpython-ptipython-3.0.22-1.6.noarch.rpm"
RPM_HASH = "23dfb95a53b6430d6237cf8fcfa1479dadb30852ce9fc9afa89b1365a12358227b2c39b7a18eba07714629258d23dd09ee0eeaaa244aa4b49345384314dd1aee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-ptpython-ptipython"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python39-ipython \
python39-ptpython"

inherit rpm
