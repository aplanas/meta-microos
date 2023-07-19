SUMMARY = "Binary files of yplan"
DESCRIPTION = "Binary files of yplan"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn34398"

RPM_NAME = "texlive-yplan-bin-2023.20230311.svn34398-93.1.aarch64.rpm"
RPM_HASH = "c09e41c0c71e575e1affff888958117170ef986e26d21080a29a04d32bc5d237054095e7eb9d83bcb1699d06ec4483882e950dcf25d49d2a53371015beb1ca1f"

RPROVIDES:${PN} += "texlive-yplan-bin"

RDEPENDS:${PN} += "texlive-yplan"

inherit rpm
