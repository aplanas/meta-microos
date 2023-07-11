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

RPM_NAME = "python310-sas7bdat-2.2.3-2.14.noarch.rpm"
RPM_HASH = "a7a62f7968b64cded17bf4244d3b0e5b8b93dde1176d5bd4073ffe649997a170f0cd0d100edc679edb1cf8ebcf1bfd21d50ecbc2eec41e3670ea38688bedc317"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sas7bdat \
python310-sas7bdat \
python3dist-sas7bdat"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-six \
update-alternatives"

inherit rpm
