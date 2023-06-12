SUMMARY = "Development files for Commons VFS"
DESCRIPTION = "This package enables support for the Commons VFS ant tasks."
LICENSE = "Apache-2.0"

PV = "2.2"

RPM_NAME = "apache-commons-vfs2-ant-2.2-1.17.noarch.rpm"
RPM_HASH = "65934b33ef66982a95e940c9b8debb60bcdaec8f2c95388fac7551d16b5a586a554af287954f87452e9d6ee96c874caf1a6c981f9aed551bf6a2e2e305c35eb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-vfs2-ant \
config(apache-commons-vfs2-ant)"
RDEPENDS:${PN} += "apache-commons-vfs2"

inherit rpm
