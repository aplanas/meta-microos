SUMMARY = "Documentation for the renderspec utility"
DESCRIPTION = "Documentation for the renderspec tool which is a tool to convert \
a spec.j2 Jinja2 template into a rpm .spec file."
LICENSE = "Apache-2.0"

PV = "2.2.0"

RPM_NAME = "python-renderspec-doc-2.2.0-2.3.noarch.rpm"
RPM_HASH = "658d3922bdada4c2fcfbc769a44ec32537e5f062133f4cb30175a29787560bbfe8009b37b8daaa680c3a01bab052be99b6b92a0c963980a086804e86debba129"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-renderspec-doc"

RDEPENDS:${PN} += "python3-renderspec"

inherit rpm
