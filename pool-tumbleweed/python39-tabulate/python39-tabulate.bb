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

RPM_NAME = "python39-tabulate-0.9.0-3.1.noarch.rpm"
RPM_HASH = "6eb5246b704d12d8cea9d27b2a14efb156cd7b3d8e54f40c2b51ab3e0edc9dd84a3fe58354855df499af21d2552bfc017531343218e43ab24e41684fcaf63371"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tabulate \
python39-tabulate \
python3dist-tabulate"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-setuptools \
update-alternatives"

inherit rpm
