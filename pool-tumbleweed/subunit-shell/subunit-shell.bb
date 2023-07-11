SUMMARY = "Shell bindings for subunit"
DESCRIPTION = "Subunit shell bindings.  See the python3-python-subunit package for test \
processing functionality."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "subunit-shell-1.4.2-2.4.noarch.rpm"
RPM_HASH = "fc05d931bc916be43c602c20bc8e9376885b71ad5bc70ef867320bc4b7c42dc56ac17e6df207ecc4a4bd22892dda4797ff9951451196034983990fa30f89318c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-subunit-shell \
subunit-shell"

RDEPENDS:${PN} += ""

inherit rpm
