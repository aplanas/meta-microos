SUMMARY = "A simple future-based async library for python"
DESCRIPTION = "A simple future-based async library for python."
LICENSE = "Apache-2.0"

PV = "0.2.8"

RPM_NAME = "python310-duet-0.2.8-1.1.noarch.rpm"
RPM_HASH = "3b822767ddcf0f985d8f1e24c2d2ae797a782f89ec03ee4adaf8090ff821760ece9f7398615fc3fbec3ce621004f38e4471cf12c51c73d8b4a6db89cc70f9503"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-duet \
python3.10dist(duet) \
python310-duet \
python3dist(duet)"

RDEPENDS:${PN} += "python(abi) \
python310-typing_extensions"

inherit rpm
