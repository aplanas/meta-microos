SUMMARY = "Development documents of fprintd"
DESCRIPTION = "This package contains Development documents for fprintd"
LICENSE = "GPL-2.0-or-later"

PV = "1.94.2"

RPM_NAME = "fprintd-doc-1.94.2-2.4.noarch.rpm"
RPM_HASH = "d0223a4bcc1d3b89dcdfa86d245706dd889e34ee82023d36cd9ddf0b2cf7b0ff12e99c728016c0f6d35c309b071943c7b3d390a7faaad49208ca6c63bfd6332a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fprintd-doc"
RDEPENDS:${PN} += "fprintd"

inherit rpm
