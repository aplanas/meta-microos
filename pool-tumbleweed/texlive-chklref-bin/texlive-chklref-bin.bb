SUMMARY = "Binary files of chklref"
DESCRIPTION = "Binary files of chklref"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn52631"

RPM_NAME = "texlive-chklref-bin-2023.20230311.svn52631-92.1.aarch64.rpm"
RPM_HASH = "3d0812125a3ce0e8e47446200c46d9ee5067acb12e0e2b36edd58a8b7c9afe99f0df67c23f42455577e98c68a9a1315fc574a975edd46c85803f3e169158a316"

RPROVIDES:${PN} += "texlive-chklref-bin"

RDEPENDS:${PN} += "texlive-chklref"

inherit rpm
