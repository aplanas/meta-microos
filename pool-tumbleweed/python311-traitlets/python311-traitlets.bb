SUMMARY = "Traitlets Python configuration system"
DESCRIPTION = "A configuration system for Python applications."
LICENSE = "BSD-3-Clause"

PV = "5.9.0"

RPM_NAME = "python311-traitlets-5.9.0-2.1.noarch.rpm"
RPM_HASH = "d5fba313365bbc1dce723b5080d375e1f47e75e640faa2aea9b02126bd70d63e4ba1ae44eef1b04c078be43b2b2ab097e9c640bf76398f199a8dde7a616a1bb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(traitlets) \
python311-traitlets \
python3dist(traitlets)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
