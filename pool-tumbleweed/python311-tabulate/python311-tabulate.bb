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

RPM_NAME = "python311-tabulate-0.9.0-3.3.noarch.rpm"
RPM_HASH = "a53fc731df6bfbb8a63cf91a3a751a649b7306a1ad1c93e43b502a54d09259d2f295849e680dc3dd6f4d12b399afe7ceeb1c4de3ad17a185634a4afc8a3b5854"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tabulate \
python3.11dist-tabulate \
python311-tabulate \
python3dist-tabulate"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-setuptools \
update-alternatives"

inherit rpm
