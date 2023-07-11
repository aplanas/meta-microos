SUMMARY = "Handle behaviour of /bin/sh"
DESCRIPTION = "Use dash as /bin/sh implementation."
LICENSE = "BSD-3-Clause"

PV = "0.5.12"

RPM_NAME = "dash-sh-0.5.12-2.3.noarch.rpm"
RPM_HASH = "b3670a8edd25568ac1a28966696676d0a2be6dcb941643bb814788c8bb930d706eedc1d95ab91ef5ce9acc86d3767d38d122702478bca88decee33e40335c92b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/sh \
alternative-sh \
dash-sh"

RDEPENDS:${PN} += "dash"

inherit rpm
