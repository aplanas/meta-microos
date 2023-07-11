SUMMARY = "Documentation for squirrel"
DESCRIPTION = "Documentation files for squirrel."
LICENSE = "MIT"

PV = "3.2"

RPM_NAME = "squirrel-doc-3.2-2.3.noarch.rpm"
RPM_HASH = "a4f69de5f09ef150faebb6929bbfba09cc8e8e6084181c937c0ddf5ec90e9ec84062adfa13843938d42e571f2bf3d1c88eca97867bc94fcaee66ac02a7165bf6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "squirrel-doc"

RDEPENDS:${PN} += ""

inherit rpm
