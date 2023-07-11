SUMMARY = "Manual pages for librmt functions"
DESCRIPTION = "This subpackage contains the manual pages for librmt's functions."
LICENSE = "CDDL-1.0"

PV = "2022.10.16"

RPM_NAME = "librmt-devel-doc-2022.10.16-47.4.noarch.rpm"
RPM_HASH = "a4bb9ba072bc6cecaccc64b6b82811daad7b259cb023e846c4c5dcce067a3cf403bcef74d7a7014f118dc2fc850ba915c8eb3fd9ef7a3d00b30b2bd84d032e35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "librmt-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
