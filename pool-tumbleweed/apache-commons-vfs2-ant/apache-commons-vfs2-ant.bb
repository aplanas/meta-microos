SUMMARY = "Development files for Commons VFS"
DESCRIPTION = "This package enables support for the Commons VFS ant tasks."
LICENSE = "Apache-2.0"

PV = "2.2"

RPM_NAME = "apache-commons-vfs2-ant-2.2-1.18.noarch.rpm"
RPM_HASH = "a9850b5a311f6268425c062a7bab965d553d4e8b8876f26a7e0a369c720da60f86cce9d1c588d1e765226c77d5dae7c032ee53314c283c72aa1ab110d10a6f4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-vfs2-ant \
config-apache-commons-vfs2-ant"

RDEPENDS:${PN} += "apache-commons-vfs2"

inherit rpm
