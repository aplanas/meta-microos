SUMMARY = "Header and source files for creating Orthanc plugins"
DESCRIPTION = "This package includes the header files to develop C/C++ plugins for Orthanc."
LICENSE = "GPL-3.0-or-later"

PV = "1.12.1"

RPM_NAME = "orthanc-devel-1.12.1-1.2.aarch64.rpm"
RPM_HASH = "ba484d7806b6eb20cb08f09a5d027b8701376dc2308d46ae3bb9bed6b3e2947c660831a0f7c59364aeec701d5d37ab09a546967c954b2357eb945b7e25cf28aa"

RPROVIDES:${PN} += "orthanc-devel \
orthanc-static"

RDEPENDS:${PN} += ""

inherit rpm
