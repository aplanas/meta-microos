SUMMARY = "Documentation for texlive-stepgreek"
DESCRIPTION = "This package includes the documentation for texlive-stepgreek"
LICENSE = "OFL-1.1"

PV = "2023.209.3.0b1svn57074"

RPM_NAME = "texlive-stepgreek-doc-2023.209.3.0b1svn57074-58.1.noarch.rpm"
RPM_HASH = "299d95a03b63908a0d1f8f23fba718b3c4e45ebb31ebd48f45e94779a34f6242ec2d3d29728a2de9efc10c7be4f32665d4e29c149e0049bf7974af9d51c9b2e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stepgreek-doc"

RDEPENDS:${PN} += ""

inherit rpm
