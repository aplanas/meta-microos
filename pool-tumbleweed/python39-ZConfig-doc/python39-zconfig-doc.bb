SUMMARY = "Structured Configuration Library"
DESCRIPTION = "This package contains documentation files for python39-ZConfig."
LICENSE = "ZPL-2.1"

PV = "3.6.1"

RPM_NAME = "python39-ZConfig-doc-3.6.1-1.5.noarch.rpm"
RPM_HASH = "b960ec20ee4f8012538873bf179956e99b7a1960edff78ea2196626f3b1290a6b60a083bd535e6d29563e19dd3a8ad90e413d91de3f85cb96c559a7a38d38985"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-ZConfig-doc"

RDEPENDS:${PN} += "python39-ZConfig"

inherit rpm
