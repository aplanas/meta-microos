SUMMARY = "Module to identify specific nodes in a JSON document"
DESCRIPTION = "A module to identify specific nodes in a JSON document (according to draft 08)."
LICENSE = "BSD-3-Clause"

PV = "2.3"

RPM_NAME = "python311-jsonpointer-2.3-2.1.noarch.rpm"
RPM_HASH = "afa6128e36334eeaa23e2e412305d99903f7f1be5b76b8575d2fcab2e5ce3e6ef51a0f64a44ad15f40c7c1beb83dace73c7e0d7cafc9d34fdb717b0f5c48c6ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-jsonpointer \
python311-jsonpointer \
python3dist-jsonpointer"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
