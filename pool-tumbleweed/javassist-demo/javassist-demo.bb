SUMMARY = "Samples for javassist"
DESCRIPTION = "Samples for javassist. \
 \
Samples for javassist."
LICENSE = "LGPL-2.1-or-later | MPL-1.1"

PV = "3.29.2"

RPM_NAME = "javassist-demo-3.29.2-1.2.noarch.rpm"
RPM_HASH = "ef66601d58ee577eb8d0f3b12acb4ed30bce8d5212e46c974e9fb2f14c2235cac81d80b90b41a19bc9bedbb5f2b82938440e3e45d7a08f97e7b4b8ffc803d671"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javassist-demo"

RDEPENDS:${PN} += "javassist"

inherit rpm
