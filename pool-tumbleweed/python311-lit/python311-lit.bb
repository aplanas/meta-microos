SUMMARY = "A portable tool for executing test suites"
DESCRIPTION = "Lit is a portable tool for executing LLVM and Clang style test suites, \
summarizing their results, and providing indication of failures. Lit is \
designed to be a lightweight testing tool with as simple a user interface \
as possible/"
LICENSE = "NCSA"

PV = "0.6.0"

RPM_NAME = "python311-lit-0.6.0-3.10.noarch.rpm"
RPM_HASH = "0156cde6109467855f6e20edd94742cbdc4052a701719bff842a280116d07ecebbac6223c54cbc5b797ff009937363ab8497b0fe839e27db87451680c4908ef8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lit \
python3-lit \
python3.11dist-lit \
python311-lit \
python3dist-lit"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
