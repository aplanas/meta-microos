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

RPM_NAME = "python311-sas7bdat-2.2.3-2.14.noarch.rpm"
RPM_HASH = "2e4792565dd3e112019fc5eef6ac0b52c8be451bc688a71a297a2d61edc30290debe7f604557d20a1d03530bcf3459a8b7cfec037454b07c256f8ed0f03ed60a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sas7bdat \
python3.11dist-sas7bdat \
python311-sas7bdat \
python3dist-sas7bdat"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-six \
update-alternatives"

inherit rpm
