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

RPM_NAME = "python310-tabulate-0.9.0-3.1.noarch.rpm"
RPM_HASH = "ebe9cb93a063fd212a5f2659b96e006c21ed46611d39f6ac3b7a45ca95b7183a736b83373999de6eb5ff380b298fe8de1353722e917c4d49b56bb665cc13c9a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tabulate \
python3.10dist(tabulate) \
python310-tabulate \
python3dist(tabulate)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-setuptools \
update-alternatives"

inherit rpm
