SUMMARY = "CFEngine example promises"
DESCRIPTION = "Lots of example promises for CFEngine."
LICENSE = "GPL-3.0-only"

PV = "3.21.0"

RPM_NAME = "cfengine-examples-3.21.0-1.4.noarch.rpm"
RPM_HASH = "a6273de8ccf01246cf1cae26fe86f6315409f55804cc8b11102f6ec9a27ee79b3228b918d61b0e35b1a07facdb48ee77f2a95c5d9098c628562b4cf8ddadaba1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cfengine-examples"
RDEPENDS:${PN} += ""

inherit rpm
