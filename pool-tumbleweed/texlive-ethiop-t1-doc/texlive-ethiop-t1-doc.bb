SUMMARY = "Documentation for texlive-ethiop-t1"
DESCRIPTION = "This package includes the documentation for texlive-ethiop-t1"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-ethiop-t1-doc-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "acec76f8774f2be1bd84ad431245582aa8a5bd36d49a8600e76a4251843e9da7cff40e3c39e0f0cc5b1cd5ee23f42a026a3b1eca2d7a80b8aa1c947f34528c3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ethiop-t1-doc"

RDEPENDS:${PN} += ""

inherit rpm
