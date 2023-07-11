SUMMARY = "Python REPL build on top of prompt_toolkit"
DESCRIPTION = "Ptpython is an advanced Python REPL."
LICENSE = "ISC"

PV = "3.0.22"

RPM_NAME = "python39-ptpython-3.0.22-1.6.noarch.rpm"
RPM_HASH = "1bccbd10acec3fd4130ab59a9292f44360bc3b3bdcbc5b488c49fea25ebe6c17553e412a5ea1730f90a7caf605c314b9dfd9d45bd01823a75fee6f6434c8050b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ptpython \
python39-ptpython \
python3dist-ptpython"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Pygments \
python39-appdirs \
python39-docopt \
python39-jedi \
python39-prompt-toolkit"

inherit rpm
