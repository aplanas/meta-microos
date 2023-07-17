SUMMARY = "Documentation files for Orthanc"
DESCRIPTION = "This package includes the documentation and the sample codes available \
for Orthanc. \
It also includes the Python and LUA Scripts, and the documentation to develop \
C/C++ plugins for Orthanc."
LICENSE = "GPL-3.0-or-later"

PV = "1.12.1"

RPM_NAME = "orthanc-doc-1.12.1-1.2.noarch.rpm"
RPM_HASH = "bcd4301e8cdbeffba8c60298ce873ff8e5f0e58b0b2dfcca1815292f2611b407f77cb3bae53317aac43593c14559667145c7a11799e3466ae1324f966c73b1c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "orthanc-doc"

RDEPENDS:${PN} += ""

inherit rpm
