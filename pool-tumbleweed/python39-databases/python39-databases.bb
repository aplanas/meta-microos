SUMMARY = "Async database support for Python"
DESCRIPTION = "Async database support for Python."
LICENSE = "BSD-3-Clause"

PV = "0.6.2"

RPM_NAME = "python39-databases-0.6.2-1.4.noarch.rpm"
RPM_HASH = "e8c62186637a17406019a81132b5721f1bba4732746961d7063708573cae55cab5025c0e2426667bd9abe399f214b6302875779cf853084b69f6ac1c522348af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(databases) \
python39-databases \
python3dist(databases)"
RDEPENDS:${PN} += "python(abi) \
python39-sqlalchemy"

inherit rpm
