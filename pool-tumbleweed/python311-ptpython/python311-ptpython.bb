SUMMARY = "Python REPL build on top of prompt_toolkit"
DESCRIPTION = "Ptpython is an advanced Python REPL."
LICENSE = "ISC"

PV = "3.0.22"

RPM_NAME = "python311-ptpython-3.0.22-1.6.noarch.rpm"
RPM_HASH = "97ec71370091d26969d6a7ece9f6fbd9820234de00da0b9834de6162e13f6c2108feb4c5685423c47c0c8d3315b81199795a3f6b191c1b05fbd6a94ad55f83f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ptpython \
python3.11dist-ptpython \
python311-ptpython \
python3dist-ptpython"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Pygments \
python311-appdirs \
python311-docopt \
python311-jedi \
python311-prompt-toolkit"

inherit rpm
