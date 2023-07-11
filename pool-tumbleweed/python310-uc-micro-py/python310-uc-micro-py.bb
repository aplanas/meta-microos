SUMMARY = "Micro subset of unicode data files for linkify-it-py projects"
DESCRIPTION = "Micro subset of unicode data files for linkify-it-py projects."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python310-uc-micro-py-1.0.1-2.3.noarch.rpm"
RPM_HASH = "cadfb286a6548b22a209eb44303ebac8ab596a7d761c5e3c5ca89d9069d76e1cd79fadd903a96b74f582d2733952ef06f8fd25b25f3e963776c0a8066fd31fc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-uc-micro-py \
python310-uc-micro-py \
python3dist-uc-micro-py"

RDEPENDS:${PN} += "python-abi"

inherit rpm
