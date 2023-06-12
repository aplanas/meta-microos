SUMMARY = "A simple future-based async library for python"
DESCRIPTION = "A simple future-based async library for python."
LICENSE = "Apache-2.0"

PV = "0.2.8"

RPM_NAME = "python39-duet-0.2.8-1.1.noarch.rpm"
RPM_HASH = "e466d3cce68f6e16c9fa4a814268c2d015d867753faed4802b08341623f6435ceaca39e3f42638ad252a97fd9f9a752c19036d83199843d35fa4c7854c71b247"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(duet) \
python39-duet \
python3dist(duet)"
RDEPENDS:${PN} += "python(abi) \
python39-typing_extensions"

inherit rpm
