SUMMARY = "Binary files of thumbpdf"
DESCRIPTION = "Binary files of thumbpdf"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn6898"

RPM_NAME = "texlive-thumbpdf-bin-2023.20230311.svn6898-92.1.aarch64.rpm"
RPM_HASH = "a282d886839ec0bb46692bd2e454741c13ba93ab6d9fb9b6f64258224f66730d43f49c0fa12dd56b3786c3fcb40ab43582db16aa8b0754782b1c87b1b524809a"

RPROVIDES:${PN} += "texlive-thumbpdf-bin"

RDEPENDS:${PN} += "texlive-thumbpdf"

inherit rpm
