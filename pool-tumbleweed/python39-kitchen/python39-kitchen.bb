SUMMARY = "Kitchen contains a cornucopia of useful code"
DESCRIPTION = "A bunch of useful python functions to be used in other projects."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.6"

RPM_NAME = "python39-kitchen-1.2.6-4.12.noarch.rpm"
RPM_HASH = "f23fcaf2ae64950f42ed5f63003db9a342a3414f3575aa11c1c03b993a9a56c5fc8a15012af87a401dacae974c52abfe382683b65a1e711f308e87ef6f8e2be5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-kitchen \
python39-kitchen \
python3dist-kitchen"

RDEPENDS:${PN} += "python-abi"

inherit rpm
