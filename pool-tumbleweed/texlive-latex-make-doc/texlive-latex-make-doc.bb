SUMMARY = "Documentation for texlive-latex-make"
DESCRIPTION = "This package includes the documentation for texlive-latex-make"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.4.3svn60874"

RPM_NAME = "texlive-latex-make-doc-2023.209.2.4.3svn60874-56.1.noarch.rpm"
RPM_HASH = "fe146dad903648c65d15ccda682d37448f509b45f8f901acd27608ac2a04e19bb86228a966747b70c818bd779cd1a6f0d328cc4f5fa87f52c6917bbe7c6b2e55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-make-doc"

RDEPENDS:${PN} += ""

inherit rpm
