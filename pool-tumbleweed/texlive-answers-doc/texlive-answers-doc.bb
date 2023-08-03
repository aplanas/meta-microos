SUMMARY = "Documentation for texlive-answers"
DESCRIPTION = "This package includes the documentation for texlive-answers"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.16svn35032"

RPM_NAME = "texlive-answers-doc-2023.209.2.16svn35032-55.1.noarch.rpm"
RPM_HASH = "b70362d0f568ef6d15ec0c29c20f279019a4e51cbaee6b7315e2ef8ecd5a8ed6b580d2cd9a1e43859eaaf72730f5e5b61b820d420b1aa321f901d964be357b35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-answers-doc"

RDEPENDS:${PN} += ""

inherit rpm
