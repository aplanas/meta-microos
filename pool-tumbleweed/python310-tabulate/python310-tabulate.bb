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

RPM_NAME = "python310-tabulate-0.9.0-3.3.noarch.rpm"
RPM_HASH = "3508f0c4c56bcd82a3819cb85be526776a06b886f6b7f5f251959ec92adb5d87b87644305872743fb2aa63db9f4f200bd54d16de8d3f2db52075a53774d459ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-tabulate \
python310-tabulate \
python3dist-tabulate"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-setuptools \
update-alternatives"

inherit rpm
