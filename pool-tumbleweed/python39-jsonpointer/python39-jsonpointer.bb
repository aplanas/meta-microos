SUMMARY = "Module to identify specific nodes in a JSON document"
DESCRIPTION = "A module to identify specific nodes in a JSON document (according to draft 08)."
LICENSE = "BSD-3-Clause"

PV = "2.3"

RPM_NAME = "python39-jsonpointer-2.3-2.1.noarch.rpm"
RPM_HASH = "35b49f80c7beb77de521a87dda132f84ad9170285d95e79d492880ae01a4e100bcdb7332ec4d1530a23cd4aaa6956aec6247703762611d11e5478de96c532bdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jsonpointer) \
python39-jsonpointer \
python3dist(jsonpointer)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
alts \
python(abi)"

inherit rpm
