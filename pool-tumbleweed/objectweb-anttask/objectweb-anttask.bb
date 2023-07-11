SUMMARY = "ObjectWeb Ant task"
DESCRIPTION = "ObjectWeb Ant task"
LICENSE = "LGPL-2.1-or-later"

PV = "1.2"

RPM_NAME = "objectweb-anttask-1.2-264.7.noarch.rpm"
RPM_HASH = "c5a58273c7f8e6b6d3f5db52714f166efe361641bbbb6fc31e09b1deb2796152f5d8d476ac2424fcc46a43a464c39a4afa4f87d8d8b3951066958623abf4ff5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "objectweb-anttask \
owanttask"

RDEPENDS:${PN} += ""

inherit rpm
