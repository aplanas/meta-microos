SUMMARY = "Documentation for texlive-teubner"
DESCRIPTION = "This package includes the documentation for texlive-teubner"
LICENSE = "LPPL-1.0"

PV = "2023.209.5.7.3svn64600"

RPM_NAME = "texlive-teubner-doc-2023.209.5.7.3svn64600-55.1.noarch.rpm"
RPM_HASH = "ba4b709982940f568cb97707225c682e1a3af55557a420e7c793a3dd38ef24d0af29a2fd66a4db18cead4f5ce99d31338618796acdc80e51721e54dcf23222b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-teubner-doc"

RDEPENDS:${PN} += ""

inherit rpm
