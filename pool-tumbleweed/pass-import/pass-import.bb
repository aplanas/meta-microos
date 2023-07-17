SUMMARY = "A pass extension for importing data from most of the existing password manager"
DESCRIPTION = "A pass extension for importing data from most of the existing password manager."
LICENSE = "GPL-3.0-only"

PV = "3.3"

RPM_NAME = "pass-import-3.3-1.7.noarch.rpm"
RPM_HASH = "9661f59e0e1bbff5a588b2a0af92b0938931ba0bff0d476dca00c7a66d7fa64da9c56335401fcb897127adf095a8c9363199d1200afff8ab783be7dc8085fb9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pass-import \
python3.11dist-pass-import \
python3dist-pass-import"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
python-abi \
python3-PyYAML"

inherit rpm
