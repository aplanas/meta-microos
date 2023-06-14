SUMMARY = "Documentation for python-fastcluster"
DESCRIPTION = "Documentation and help files for python-fastcluster."
LICENSE = "BSD-2-Clause"

PV = "1.2.6"

RPM_NAME = "python-fastcluster-doc-1.2.6-1.5.aarch64.rpm"
RPM_HASH = "e6d99c6e7c925866203dbad1abd33b3d4cb41019a2f8c2eb9235810f97850598a3f1e10288b8153865ff6cb8d540ddfaff714a40884f099b093135b1d2dcefb5"

RPROVIDES:${PN} += "python-fastcluster-doc \
python310-fastcluster-doc \
python311-fastcluster-doc \
python39-fastcluster-doc"

RDEPENDS:${PN} += ""

inherit rpm
