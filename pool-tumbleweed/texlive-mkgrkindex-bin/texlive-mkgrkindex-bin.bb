SUMMARY = "Binary files of mkgrkindex"
DESCRIPTION = "Binary files of mkgrkindex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn14428"

RPM_NAME = "texlive-mkgrkindex-bin-2023.20230311.svn14428-93.1.aarch64.rpm"
RPM_HASH = "274e0f3d33a30713995dcdff7a1d6d96e0d4835a428c8d4e044ccd9fece0678859405fcb9c6049fa805b0f5aeaa93acdd62c9f52d797adba24c704bd0475f3ec"

RPROVIDES:${PN} += "texlive-mkgrkindex-bin"

RDEPENDS:${PN} += "texlive-mkgrkindex"

inherit rpm
