SUMMARY = "Documentation for the renderspec utility"
DESCRIPTION = "Documentation for the renderspec tool which is a tool to convert \
a spec.j2 Jinja2 template into a rpm .spec file."
LICENSE = "Apache-2.0"

PV = "2.2.0"

RPM_NAME = "python-renderspec-doc-2.2.0-3.1.noarch.rpm"
RPM_HASH = "32af4c60b09aceac0ca411adeeecec3221a2524d2483f51df483a4455eac4dbd5b6d1e40d6421ca630b4bc2f0050e3aed1c1cd7ef1f0a28803f7744344921f9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-renderspec-doc"

RDEPENDS:${PN} += "python3-renderspec"

inherit rpm
