SUMMARY = "Documentation for Claw library"
DESCRIPTION = "This subpackage contains the documentation and examples for using \
libclaw."
LICENSE = "LGPL-2.1-or-later"

PV = "1.7.4"

RPM_NAME = "libclaw-doc-1.7.4-4.11.noarch.rpm"
RPM_HASH = "1bb66d628b8e4046acb7cabf73d6fa9a8d2ee3d2bfcfd9a30f0d2da2dca2566305194d706bc379aa7c2c679b8619548fe5b172149c8e8d53b7e182c5857b5dc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libclaw-doc"

RDEPENDS:${PN} += ""

inherit rpm
