SUMMARY = "CLI tool to convert a python project's  strings to f-strings"
DESCRIPTION = "CLI tool to convert a python project's  strings to f-strings."
LICENSE = "MIT"

PV = "0.78"

RPM_NAME = "python39-flynt-0.78-1.1.noarch.rpm"
RPM_HASH = "f8dc782741bbc35bc9ea9149471b67846eafbcb4938c6d4acb777c3eeee72c1ac7d8ca0d6c493b94c3288fd149c5ad738779722c93bf5f23dc8130f673476b89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flynt \
python39-flynt \
python3dist-flynt"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-astor \
python39-tomli"

inherit rpm
