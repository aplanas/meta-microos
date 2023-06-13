SUMMARY = "A sas7bdat file reader for Python"
DESCRIPTION = "This module will read sas7bdat files using pure Python (2.6+, 3+). No SAS software \
required! The module started out as a port of the R script of the same name \
found here: <https://github.com/BioStatMatt/sas7bdat> but has since been \
completely rewritten. \
 \
Also included with this library is a simple command line script, \
`sas7bdat_to_csv`, which converts sas7bdat files to csv files. It will also \
print out header information and meta data using the `--header` option and it \
will batch convert files as well. Use the `--help` option for more information."
LICENSE = "MIT"

PV = "2.2.3"

RPM_NAME = "python39-sas7bdat-2.2.3-2.13.noarch.rpm"
RPM_HASH = "34eda369dc49e3ff78263b1c2d4d46c1e1f892168fd7357cfcaaefb874930d1abf35c66c604ff6f2b3d2296508f5a65260c59b1294aae6925fca57e0e09d34c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sas7bdat) \
python39-sas7bdat \
python3dist(sas7bdat)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-six \
update-alternatives"

inherit rpm
