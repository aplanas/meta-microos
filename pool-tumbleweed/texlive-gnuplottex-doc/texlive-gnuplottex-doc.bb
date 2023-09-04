SUMMARY = "Documentation for texlive-gnuplottex"
DESCRIPTION = "This package includes the documentation for texlive-gnuplottex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.9.5svn54758"

RPM_NAME = "texlive-gnuplottex-doc-2023.209.0.0.9.5svn54758-54.2.noarch.rpm"
RPM_HASH = "392adb90605482c1dbe28b2f8ecc30db6a0287f4ad45b2d44bdc8349dcba29cd9b536f10a47af812a3c8dd6b86f37071e8c2980ad8d6027712736b871b324e92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gnuplottex-doc"

RDEPENDS:${PN} += ""

inherit rpm
