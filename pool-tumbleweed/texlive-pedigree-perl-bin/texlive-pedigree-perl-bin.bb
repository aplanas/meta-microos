SUMMARY = "Binary files of pedigree-perl"
DESCRIPTION = "Binary files of pedigree-perl"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn25962"

RPM_NAME = "texlive-pedigree-perl-bin-2023.20230311.svn25962-92.1.aarch64.rpm"
RPM_HASH = "c2da9762cfe18b3e7b75fad654bde50bf96bc10bbfc6080f5d0b07b153baf0a3db08ee299ba068537ee99041745da0bdb577513880b3a28b32d082253468b3d5"

RPROVIDES:${PN} += "texlive-pedigree-perl-bin"

RDEPENDS:${PN} += "texlive-pedigree-perl"

inherit rpm
