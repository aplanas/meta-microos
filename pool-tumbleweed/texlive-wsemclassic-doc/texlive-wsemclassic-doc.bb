SUMMARY = "Documentation for texlive-wsemclassic"
DESCRIPTION = "This package includes the documentation for texlive-wsemclassic"
LICENSE = "BSD-3-Clause"

PV = "2023.201.1.0.1svn31532"

RPM_NAME = "texlive-wsemclassic-doc-2023.201.1.0.1svn31532-52.2.noarch.rpm"
RPM_HASH = "f6ba68b01fdfc2e8767bfb189cfa783fdf0552190096ab18c4a856334d47dcfe5b1a5c8ee6731d74cd64134e3a1326172e67e06b035b17f62c44cd098bdce918"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wsemclassic-doc"

RDEPENDS:${PN} += ""

inherit rpm
