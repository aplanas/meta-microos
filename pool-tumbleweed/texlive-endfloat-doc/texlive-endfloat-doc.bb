SUMMARY = "Documentation for texlive-endfloat"
DESCRIPTION = "This package includes the documentation for texlive-endfloat"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.7svn57090"

RPM_NAME = "texlive-endfloat-doc-2023.209.2.7svn57090-54.1.noarch.rpm"
RPM_HASH = "53c8a4315994596e8066ee61de290bfc2076edf2342874d9d5e51615975482a811a4b1249b1c04e481cc33ceda9d7c3bf9373d2104b725a9b21281ac82ab81ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-endfloat-doc"

RDEPENDS:${PN} += ""

inherit rpm
