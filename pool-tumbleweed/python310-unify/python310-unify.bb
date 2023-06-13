SUMMARY = "Tool to modify strings to use the same quotes"
DESCRIPTION = "Modifies strings to all use the same (single/double) quote where possible. \
 \
Note that the 'unify' executable has been renamed to 'unify_quotes' to \
avoid conflicts with the wdiff package."
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "python310-unify-0.5-2.13.noarch.rpm"
RPM_HASH = "fc38d184cd416255b2be29f5f43ef74f913d176cbb8f9fa901fde6ed187126cd189ef91d3c4ce987a5e09fe409933dc9ab27cef2f20cf8833049f22b683973e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-unify \
python3.10dist(unify) \
python310-unify \
python3dist(unify)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-setuptools \
python310-untokenize \
update-alternatives"

inherit rpm
