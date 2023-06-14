SUMMARY = "Documentation for texlive-mendex-doc"
DESCRIPTION = "This package includes the documentation for texlive-mendex-doc"
LICENSE = "BSD-3-Clause"

PV = "2023.201.svn62914"

RPM_NAME = "texlive-mendex-doc-doc-2023.201.svn62914-52.1.noarch.rpm"
RPM_HASH = "0a363830d19ffaf63dfa8f1143e0a1ae8fa7431d8db492b8f5a7cf37c88ae801685d1ee4a5bb92909e7a0667490c0d24f481049cf21d752efdf63f004b37a7cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-mendex-doc-doc-ja \
texlive-mendex-doc-doc"

RDEPENDS:${PN} += ""

inherit rpm
