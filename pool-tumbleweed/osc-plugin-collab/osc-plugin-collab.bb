SUMMARY = "Plugin to make collaboration easier with osc"
DESCRIPTION = "This osc plugin extends osc with commands that makes it easier to use \
the collaboration feature in the Build Service, and to keep up with \
latest upstream versions."
LICENSE = "BSD-3-Clause"

PV = "0.104+26"

RPM_NAME = "osc-plugin-collab-0.104+26-1.1.noarch.rpm"
RPM_HASH = "b4320db5e28e1970ff8ae97bf70fb8b64d1b9bae2df3621e8b159b8d41f106909a2efb90c806e083a8471c2e0101c8c43773a98f765bafb0832a61ba8a50f9cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "osc-plugin-collab"

RDEPENDS:${PN} += "osc"

inherit rpm
