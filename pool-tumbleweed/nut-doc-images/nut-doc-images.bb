SUMMARY = "Network UPS Tools - Images for Documentation"
DESCRIPTION = "Images for the documentation. It is a supplementary package for some NUT \
documentation packages. \
 \
Network UPS Tools is a collection of programs which provide a common \
interface for monitoring and administering UPS hardware."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "nut-doc-images-2.8.0-3.1.noarch.rpm"
RPM_HASH = "3a90b6b3b5a29b0798e5f23288d7d3325275241c6c2647665175aa870682bd89a7649740531b9e97cdd25e387c5e33ac9a4c9317dc7b5a0602b5ff8cd49f5871"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nut-doc-images"

RDEPENDS:${PN} += "nut-doc-images"

inherit rpm
