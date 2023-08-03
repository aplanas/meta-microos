SUMMARY = "Documentation for texlive-nunito"
DESCRIPTION = "This package includes the documentation for texlive-nunito"
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.0.1svn57429"

RPM_NAME = "texlive-nunito-doc-2023.209.0.0.0.1svn57429-55.1.noarch.rpm"
RPM_HASH = "30ec2825e89392e1e583083f8bba2d3f4e4d7920417d0f2b52b3853d841424ea068585bf29f2a408c438c271bb6fe5687c638baaabd9281590d14c2f92ffe107"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nunito-doc"

RDEPENDS:${PN} += ""

inherit rpm
