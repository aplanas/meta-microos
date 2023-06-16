SUMMARY = "Handle behaviour of /bin/sh"
DESCRIPTION = "Use bash as /bin/sh implementation."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.15"

RPM_NAME = "bash-sh-5.2.15-8.3.noarch.rpm"
RPM_HASH = "9a9210d07523d2e8cb74ed2ac44545f0218abf42328096134eb809de40820d463763db40b89df7dae64fea07c0db7bd30012cb163b0b8f39267c21748cf6810c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/sh \
alternative-sh \
bash-sh"

RDEPENDS:${PN} += "bash"

inherit rpm
