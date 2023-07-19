SUMMARY = "Binary files of pedigree-perl"
DESCRIPTION = "Binary files of pedigree-perl"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn25962"

RPM_NAME = "texlive-pedigree-perl-bin-2023.20230311.svn25962-93.1.aarch64.rpm"
RPM_HASH = "33679b03ed9626350e35d1a48d273776d4b3618da54f9344b83a83be8635ffc73a0e669314f9a8a6fe4f73f945814f1a5c532933462360dd149335ef721484e5"

RPROVIDES:${PN} += "texlive-pedigree-perl-bin"

RDEPENDS:${PN} += "texlive-pedigree-perl"

inherit rpm
