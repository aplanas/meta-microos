SUMMARY = "Package for testing the update stack during product development"
DESCRIPTION = "Package for testing the update stack during product development. \
 \
We will provide a 'always' working update for this package so that the \
update stack could be easily tested."
LICENSE = "GPL-2.0+"

PV = "5.1"

RPM_NAME = "update-test-trivial-5.1-1.18.aarch64.rpm"
RPM_HASH = "8c955577bb440659a3b4ff7c0a55116efa5f298cb64fc222de17948a8433938b5fc0bea8556e1c1ec5333fbe9fd634a90f681c0062d97a6aae85ac346735a6c0"

RPROVIDES:${PN} += "update-test-trivial"

RDEPENDS:${PN} += ""

inherit rpm
