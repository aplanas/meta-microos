SUMMARY = "Kombu actor framework"
DESCRIPTION = "Actor framework for Kombu"
LICENSE = "BSD-2-Clause"

PV = "0.0.3"

RPM_NAME = "python311-cl-0.0.3-16.4.noarch.rpm"
RPM_HASH = "444a341ff5f1e915fdfb8fd75f03f194909d465d5c0ea2ec52803ed47d754d9fa5449e375632029c3caf61d15583c1c2fccb4ea282bdb16a3ab91733d89795b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-cl \
python311-cl \
python3dist-cl"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-kombu \
update-alternatives"

inherit rpm
