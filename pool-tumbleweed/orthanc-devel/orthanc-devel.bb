SUMMARY = "Header and source files for creating Orthanc plugins"
DESCRIPTION = "This package includes the header files to develop C/C++ plugins for Orthanc."
LICENSE = "GPL-3.0-or-later"

PV = "1.12.1"

RPM_NAME = "orthanc-devel-1.12.1-1.1.aarch64.rpm"
RPM_HASH = "abd1a71addbca4760c4b453b9cdee0d3874169ac8ca581ec332df31a3cfa81c4e26fab63e33592a9a9510dfe24b95c438343812891b594e72804cd7f0b525c08"

RPROVIDES:${PN} += "orthanc-devel \
orthanc-static"

RDEPENDS:${PN} += ""

inherit rpm
