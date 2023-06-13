SUMMARY = "Unified diff parsing/metadata extraction library"
DESCRIPTION = "Python library to parse and interact with unified diff data."
LICENSE = "MIT"

PV = "0.7.4"

RPM_NAME = "python311-unidiff-0.7.4-1.5.noarch.rpm"
RPM_HASH = "b42e4296d00b4f6a249d3c4562c6bf7da12f10864dd5dbf648e0245565cac56b2faeffa8b6e225216596aca9e440ee588fc49a1f67cdc72aab76617597c94b15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(unidiff) \
python311-unidiff \
python3dist(unidiff)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
update-alternatives"

inherit rpm
