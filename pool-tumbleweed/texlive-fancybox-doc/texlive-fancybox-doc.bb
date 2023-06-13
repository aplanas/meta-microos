SUMMARY = "Documentation for texlive-fancybox"
DESCRIPTION = "This package includes the documentation for texlive-fancybox"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn18304"

RPM_NAME = "texlive-fancybox-doc-2023.201.1.4svn18304-52.1.noarch.rpm"
RPM_HASH = "c86fdd2b39efc2d9d590693ec07390a7c182855d9922e9e0faea4afaf769f4b080127fbf9bb5ae62a279c0aaa2929925415dba9cf40fcc4c274e7f51db8cc29f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fancybox-doc"

RDEPENDS:${PN} += ""

inherit rpm
