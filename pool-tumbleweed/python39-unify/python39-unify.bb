SUMMARY = "Tool to modify strings to use the same quotes"
DESCRIPTION = "Modifies strings to all use the same (single/double) quote where possible. \
 \
Note that the 'unify' executable has been renamed to 'unify_quotes' to \
avoid conflicts with the wdiff package."
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "python39-unify-0.5-2.15.noarch.rpm"
RPM_HASH = "b9c7037f2c0489f510d1f7f69f12326faaa21393b7199ca857057732b20ae936a5f4fd019afd556bfb03c641be92b4dcd71348b985ecb89876fc44daceedab0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-unify \
python39-unify \
python3dist-unify"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-setuptools \
python39-untokenize \
update-alternatives"

inherit rpm
