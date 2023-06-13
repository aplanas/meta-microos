SUMMARY = "Documentation for the libxfce4ui Library"
DESCRIPTION = "This package provides the documentation for the libxfce4ui library."
LICENSE = "LGPL-2.1-or-later"

PV = "4.18.4"

RPM_NAME = "libxfce4ui-doc-4.18.4-1.1.noarch.rpm"
RPM_HASH = "b1ee574e3d7ca88b7c9fd5d99d0f1ecf700994ce5cf877f4c9b733e0252a2dcd284ebeb96399b55c9badae3cc4acc50c2149393ce5b9baa7a05aa133e065761a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libxfce4ui-doc"

RDEPENDS:${PN} += ""

inherit rpm
