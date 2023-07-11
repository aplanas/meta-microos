SUMMARY = "Documentation files for xonsh"
DESCRIPTION = "HTML documentation on the API and examples for xonsh."
LICENSE = "BSD-2-Clause & BSD-3-Clause"

PV = "0.14.0"

RPM_NAME = "xonsh-doc-0.14.0-1.1.noarch.rpm"
RPM_HASH = "92394d12b354c04913ef8b40b0c7c24502e88b8944addc9d4800248169909a1634d5434733fda99e9483f4c6e6e25910f393a540f403770eeff9600e7570ab71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xonsh-doc"

RDEPENDS:${PN} += ""

inherit rpm
