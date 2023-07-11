SUMMARY = "Documentation for the GNU Core Utilities"
DESCRIPTION = "This package contains the documentation for the GNU Core Utilities."
LICENSE = "GPL-3.0-or-later"

PV = "9.3"

RPM_NAME = "coreutils-doc-9.3-1.2.noarch.rpm"
RPM_HASH = "a6634dd7cf5f28c6974b3ddd6694a96a8cc44335da0937294d0785cc90cb8cc67bcc1ebe3fdb6a47be38f8e3cc9427b64e005a0016cb2778c0e07cc87b4ce643"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "coreutils-/usr/share/info/coreutils.info.gz \
coreutils-doc"

RDEPENDS:${PN} += ""

inherit rpm
