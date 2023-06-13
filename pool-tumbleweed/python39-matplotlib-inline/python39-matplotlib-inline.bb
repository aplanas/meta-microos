SUMMARY = "Inline Matplotlib backend for Jupyter"
DESCRIPTION = "Matplotlib Inline Back-end for IPython and Jupyter"
LICENSE = "BSD-3-Clause"

PV = "0.1.6"

RPM_NAME = "python39-matplotlib-inline-0.1.6-1.3.noarch.rpm"
RPM_HASH = "8416ef40f15f6ad2b43e432a4a8dc4963f5c24ad4832be22cb92a89b1f0d9ee7b625c3c9fe3116a80fb44d4926d12e782d91de74c2ef4667bd9528b1ab4788ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(matplotlib-inline) \
python39-matplotlib-inline \
python3dist(matplotlib-inline)"

RDEPENDS:${PN} += "python(abi) \
python39-traitlets"

inherit rpm
