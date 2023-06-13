SUMMARY = "Files to use compleat in the fish shell"
DESCRIPTION = " \
Contains a script that is automatically loaded by the fish shell on startup to \
setup the automatic completion by compleat."
LICENSE = "MIT"

PV = "1.0+git.20220402.ec8fccc"

RPM_NAME = "compleat-fish-1.0+git.20220402.ec8fccc-1.8.noarch.rpm"
RPM_HASH = "30cfc171be4ddd0dc2d3024846a600be53a7ccf23c5d4c5d98a850bc86a71209a3182e3bd45f80f1d1e432b2d0a272f0e3ed4ab2506f02036386de057bd3c7b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "compleat-fish"

RDEPENDS:${PN} += "compleat"

inherit rpm
