SUMMARY = "Files to use compleat in the fish shell"
DESCRIPTION = " \
Contains a script that is automatically loaded by the fish shell on startup to \
setup the automatic completion by compleat."
LICENSE = "MIT"

PV = "1.0+git.20220402.ec8fccc"

RPM_NAME = "compleat-fish-1.0+git.20220402.ec8fccc-1.10.noarch.rpm"
RPM_HASH = "f9b811bc5e2074d28ac38647a9b37cf77f07ac0718b400e85489b88d8e92026393cc8e92f9b116030791cbdf2221b2593ce258fe278f00debac56d3ccf1eb742"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "compleat-fish"

RDEPENDS:${PN} += "compleat"

inherit rpm
