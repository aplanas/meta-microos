SUMMARY = "Pretty-printer for tabular data in Python"
DESCRIPTION = "Pretty-printer for tabular data in Python. \
 \
The main use cases of the library are: \
 \
 * printing small tables without hassle: just one function call, \
   formatting is guided by the data itself \
 * authoring tabular data for lightweight plain-text markup: multiple \
   output formats suitable for further editing or transformation \
 * readable presentation of mixed textual and numeric data: smart \
   column alignment, configurable number formatting, alignment by a \
   decimal point"
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python39-tabulate-0.9.0-3.3.noarch.rpm"
RPM_HASH = "e06e505e1adc596b4b0e777709b5942378d4aae55a712249c0d458b2bdafd7802b064170cafd87863ec19bb5fe3cc51b2aedf7e3aff4ca782dcbe1c5de705cb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tabulate \
python39-tabulate \
python3dist-tabulate"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-setuptools \
update-alternatives"

inherit rpm
