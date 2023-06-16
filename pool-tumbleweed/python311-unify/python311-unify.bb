SUMMARY = "Tool to modify strings to use the same quotes"
DESCRIPTION = "Modifies strings to all use the same (single/double) quote where possible. \
 \
Note that the 'unify' executable has been renamed to 'unify_quotes' to \
avoid conflicts with the wdiff package."
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "python311-unify-0.5-2.13.noarch.rpm"
RPM_HASH = "c2b59e5c395d8a6b9b430e84ae4ed54282297c514d91b67e9c21cdae527bc626f5eb58b46659f2700b943901b0a3ec42efc824a0c8d61fd800973bcb3b970c0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-unify \
python311-unify \
python3dist-unify"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-setuptools \
python311-untokenize \
update-alternatives"

inherit rpm
