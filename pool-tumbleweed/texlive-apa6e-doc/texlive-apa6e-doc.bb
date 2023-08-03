SUMMARY = "Documentation for texlive-apa6e"
DESCRIPTION = "This package includes the documentation for texlive-apa6e"
LICENSE = "BSD-3-Clause"

PV = "2023.209.0.0.3svn23350"

RPM_NAME = "texlive-apa6e-doc-2023.209.0.0.3svn23350-55.1.noarch.rpm"
RPM_HASH = "7c6b750307f97e5a0ccae73b5b2c8f36773b0bb37f8946af0f6b890646632576273c6f61070bee5ec08ee117e88edcd129c768ae636c89a84025770a330f9964"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-apa6e-doc"

RDEPENDS:${PN} += ""

inherit rpm
