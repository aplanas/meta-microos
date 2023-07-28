SUMMARY = "Python bindings for GlusterFS"
DESCRIPTION = "GlusterFS is a clustered file-system capable of scaling to several \
petabytes."
LICENSE = "GPL-2.0-only | LGPL-3.0-or-later"

PV = "11.0"

RPM_NAME = "python3-gluster-11.0-4.1.noarch.rpm"
RPM_HASH = "9d4a643885b5afde0fc8b60975c96d8ceeeae19d2617d59d8369da3539428636da4ff2161c0840679514362e3d50df92b389ad314448d1715163d0df400cb292"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gluster"

RDEPENDS:${PN} += "python-abi"

inherit rpm
