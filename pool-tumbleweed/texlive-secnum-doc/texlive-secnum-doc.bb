SUMMARY = "Documentation for texlive-secnum"
DESCRIPTION = "This package includes the documentation for texlive-secnum"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn61813"

RPM_NAME = "texlive-secnum-doc-2023.209.svn61813-54.1.noarch.rpm"
RPM_HASH = "39b787cbe9972d523bfd2a019a2d196fc1ce224a6133a92ec72caffa505d95d2b71b81c58bbd3fc04c669b8a0b584b12d244a85b1bc7a677b2f6c0bfe34f6396"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-secnum-doc"

RDEPENDS:${PN} += ""

inherit rpm
