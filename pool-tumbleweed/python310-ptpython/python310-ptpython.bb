SUMMARY = "Python REPL build on top of prompt_toolkit"
DESCRIPTION = "Ptpython is an advanced Python REPL."
LICENSE = "ISC"

PV = "3.0.22"

RPM_NAME = "python310-ptpython-3.0.22-1.4.noarch.rpm"
RPM_HASH = "2b1b5ce131824f8dfad5befbbc536521e2b1c8aee87f0df9094fc58ab2c516b4fc161009beb15c2f0935bb40d9728cd66b52f00a6a8283af10094c1181c795a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ptpython \
python3.10dist-ptpython \
python310-ptpython \
python3dist-ptpython"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-Pygments \
python310-appdirs \
python310-docopt \
python310-jedi \
python310-prompt-toolkit"

inherit rpm
