SUMMARY = "Tool to modify strings to use the same quotes"
DESCRIPTION = "Modifies strings to all use the same (single/double) quote where possible. \
 \
Note that the 'unify' executable has been renamed to 'unify_quotes' to \
avoid conflicts with the wdiff package."
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "python310-unify-0.5-2.15.noarch.rpm"
RPM_HASH = "b2c10e6c87903abea025c1bb1f76cf1f87226e7cda3a33d611e420cc519157d071d323e168fe80499e4e561227c90f3cad74195deb1d9f9cde60adef9111912f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-unify \
python310-unify \
python3dist-unify"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-setuptools \
python310-untokenize \
update-alternatives"

inherit rpm
