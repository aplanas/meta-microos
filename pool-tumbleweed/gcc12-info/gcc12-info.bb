SUMMARY = "Documentation for the GNU compiler collection"
DESCRIPTION = "GNU info-pages for the GNU compiler collection covering both user-level \
and internals documentation."
LICENSE = "GFDL-1.2-only"

PV = "12.3.0+git1204"

RPM_NAME = "gcc12-info-12.3.0+git1204-1.33.noarch.rpm"
RPM_HASH = "2f9ca3f8eab6fa3a2962b9df9aa4510632a78436bb2abdbd894705bc7d95112e0354c6785d2cba9cc209b6752e29ec52b8a7d8894b70fc9f43ff1639aad7efbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcc12-info"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
