SUMMARY = "Documentation for OpenStack common context library"
DESCRIPTION = "Documentation for the oslo-context library."
LICENSE = "Apache-2.0"

PV = "5.0.0"

RPM_NAME = "python-oslo.context-doc-5.0.0-1.4.noarch.rpm"
RPM_HASH = "dad1ce508be22417d7588591d203bbe23a7e55e5fe5f41410f4be94db5fbb2e7b567fa8c365cff7da7859f645efa578d5072cf702cf6ca5fb43a829ef5d20659"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-oslo.context-doc"

RDEPENDS:${PN} += ""

inherit rpm
