SUMMARY = "Tool to modify strings to use the same quotes"
DESCRIPTION = "Modifies strings to all use the same (single/double) quote where possible. \
 \
Note that the 'unify' executable has been renamed to 'unify_quotes' to \
avoid conflicts with the wdiff package."
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "python311-unify-0.5-2.15.noarch.rpm"
RPM_HASH = "e211a0c71e370ef206b8bfddccea5173d951f9111a59b69f969f5234c3bb26af97366d8d0c91480f4d022881a90bbebee4920700bf527d16a61f47681ba00e5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-unify \
python3.11dist-unify \
python311-unify \
python3dist-unify"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-setuptools \
python311-untokenize \
update-alternatives"

inherit rpm
