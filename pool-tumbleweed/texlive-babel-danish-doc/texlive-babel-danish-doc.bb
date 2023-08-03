SUMMARY = "Documentation for texlive-babel-danish"
DESCRIPTION = "This package includes the documentation for texlive-babel-danish"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3ssvn57642"

RPM_NAME = "texlive-babel-danish-doc-2023.209.1.3ssvn57642-54.1.noarch.rpm"
RPM_HASH = "373ce81d4edcd9afd677d4d03d8646a4cd36d1eeeccd541c7b65f11c6e575f2ba930eb6c33533b844b60475f10073ade690b67672c7c49f4cd84bf503360b670"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-danish-doc"

RDEPENDS:${PN} += ""

inherit rpm
