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

RPM_NAME = "python311-sas7bdat-2.2.3-2.13.noarch.rpm"
RPM_HASH = "1abd76cdbdef73c7d1c31d028dd2ee070c098a54a15d6b056f60fcf9d58cb1635f101fe55a94044df66fea7b8db421d9a8cb8516200702a17c1359bfb6a6ecfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-sas7bdat \
python311-sas7bdat \
python3dist-sas7bdat"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-six \
update-alternatives"

inherit rpm
