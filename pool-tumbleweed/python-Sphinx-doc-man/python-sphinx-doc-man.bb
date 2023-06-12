SUMMARY = "Man files for python-Sphinx"
DESCRIPTION = "Sphinx is a tool that facilitates creating documentation for Python \
projects (or other documents consisting of multiple reStructuredText \
sources). \
 \
This package contains the manual pages for the Sphinx executables."
LICENSE = "BSD-2-Clause"

PV = "7.0.1"

RPM_NAME = "python-Sphinx-doc-man-7.0.1-1.2.noarch.rpm"
RPM_HASH = "923dcd9ccef2938c653036885e99c9831dec12fad6866d791dc0ec0dd7495c0d1420150ca7f97679c5fa951cee99f7a5d140a1b22893402e629a8ed86458b2f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-Sphinx-doc-man"
RDEPENDS:${PN} += "python3-Sphinx \
update-alternatives"

inherit rpm
