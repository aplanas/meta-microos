SUMMARY = "CTAN guidelines verifier and corrector for uploading projects"
DESCRIPTION = "Basic gawk program that uses CTAN's published guidelines for \
authors to help eliminate sloppiness in uploaded \
files/projects. It is completely open for users to program \
additional guidelines as well as CTAN's future adjustments."
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.1.0svn36304"

RPM_NAME = "texlive-ctan_chk-2023.204.1.0svn36304-54.1.noarch.rpm"
RPM_HASH = "09dc04886480c58f4368df8e8eb9472e9ca02fc819304f7653d85f003d90cde9049efb0e11e215a80220b133b50805b6f206cfca01381c05e827dc599fa85f1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ctan-chk"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
