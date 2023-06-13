SUMMARY = "Mako template bindings for the Pyramid web framework"
DESCRIPTION = "Mako template bindings for the Pyramid web framework."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python311-pyramid-mako-1.1.0-3.8.noarch.rpm"
RPM_HASH = "16c26622c1e0ea78cd47e566bba17b89e28ad3d655fb7809d7757a83697ab6f48e5114cb52751f02b9d07957d334d5d5469a79b445050cc25ae5fadd1121af2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyramid-mako) \
python311-pyramid-mako \
python3dist(pyramid-mako)"

RDEPENDS:${PN} += "python(abi) \
python311-Mako \
python311-pyramid"

inherit rpm
