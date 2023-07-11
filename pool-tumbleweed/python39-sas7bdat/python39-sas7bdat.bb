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

RPM_NAME = "python39-sas7bdat-2.2.3-2.14.noarch.rpm"
RPM_HASH = "871ec9b81cde442943cedb40e57ee3cbd10620fa7fc57cf4606cf3a71c0b883045a4a59d52ac65c0c43c7a4bb9c3039de3db6f861b802522ee274d9c1a7c681c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sas7bdat \
python39-sas7bdat \
python3dist-sas7bdat"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-six \
update-alternatives"

inherit rpm
