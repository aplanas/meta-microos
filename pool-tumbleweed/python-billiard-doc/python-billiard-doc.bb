SUMMARY = "Documentation for python-billiard"
DESCRIPTION = "Documentation and help files for python-billiard."
LICENSE = "BSD-3-Clause"

PV = "4.1.0"

RPM_NAME = "python-billiard-doc-4.1.0-2.3.noarch.rpm"
RPM_HASH = "ed6e0ad34764aa8efcaaabc64244e952375c293a9793c8f202e7b19c1fb6a67c4b65eac02716a6eb1a6e510bfd0f2251a9cb39d7b4000616cbd95b28c9104849"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-billiard-doc \
python2-billiard \
python310-billiard-doc \
python311-billiard-doc \
python39-billiard-doc"

RDEPENDS:${PN} += ""

inherit rpm
