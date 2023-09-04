SUMMARY = "GlusterFS Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for returning objects directly from a GlusterFS \
filesystem"
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "uwsgi-glusterfs-2.0.21-3.2.aarch64.rpm"
RPM_HASH = "cf1ca88c8ef625162d4c527c551474e602acf486d4eb6ac71a252533a31a892afa0d6c702b3795549aa55a1c2652a6951915ef2dd0f89e5768fe1aa228ec226d"

RPROVIDES:${PN} += "uwsgi-glusterfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgfapi.so.0 \
uwsgi"

inherit rpm
