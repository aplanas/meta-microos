SUMMARY = "Sphinx directives versionremoved and removed-in"
DESCRIPTION = "Sphinx Removed In Extension"
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "python311-sphinx-removed-in-0.2.1-2.3.noarch.rpm"
RPM_HASH = "2bab65e8bd133c6479d728fbeee7747234a498e68989550b2d94e674aa32faebe4bcb14ebea5dfbf3d8b584669fec4082ead509c60fc4856e388e105c298acdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sphinx-removed-in) \
python311-sphinx-removed-in \
python3dist(sphinx-removed-in)"
RDEPENDS:${PN} += "python(abi) \
python311-Sphinx"

inherit rpm
