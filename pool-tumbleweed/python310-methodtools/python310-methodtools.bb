SUMMARY = "Expand Standard Functools to Methods"
DESCRIPTION = "Expand functools features to methods, classmethods, \
staticmethods and even for (unofficial) hybrid methods."
LICENSE = "BSD-2-Clause"

PV = "0.4.2"

RPM_NAME = "python310-methodtools-0.4.2-1.14.noarch.rpm"
RPM_HASH = "01aaa3e460d68c21e06032288a0c810dbb63ce0f2a4f53882b84e1da16cc99ca6f9ebaeeac0bd6103ca0267489c0fbc84b6a9c0b749ec4d79f8a086a1e952aa1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-methodtools \
python310-methodtools \
python3dist-methodtools"

RDEPENDS:${PN} += "python-abi \
python310-wirerope"

inherit rpm
