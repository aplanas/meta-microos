SUMMARY = "Python REPL build on top of prompt_toolkit"
DESCRIPTION = "Ptpython is an advanced Python REPL."
LICENSE = "ISC"

PV = "3.0.22"

RPM_NAME = "python310-ptpython-3.0.22-1.6.noarch.rpm"
RPM_HASH = "382c8773c3bb651c7c1d6a1faf4d58fd3fe503f3410026187bd05e01ed2545f64ee2c08509a1ff9ac0667b939d0ea669cac83d7a693b0080431d71988df86c90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ptpython \
python310-ptpython \
python3dist-ptpython"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Pygments \
python310-appdirs \
python310-docopt \
python310-jedi \
python310-prompt-toolkit"

inherit rpm
