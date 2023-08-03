SUMMARY = "Documentation for texlive-euenc"
DESCRIPTION = "This package includes the documentation for texlive-euenc"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1hsvn19795"

RPM_NAME = "texlive-euenc-doc-2023.209.0.0.1hsvn19795-53.1.noarch.rpm"
RPM_HASH = "b73d170526be8c5d1e909f5ddee99ab54ee3606e79e8dbd535bda383b2d3d457717753417ef403f74f02c38cf922ea98ce5ab0c0c9e1b3d39af78a648f86cda2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-euenc-doc"

RDEPENDS:${PN} += ""

inherit rpm
