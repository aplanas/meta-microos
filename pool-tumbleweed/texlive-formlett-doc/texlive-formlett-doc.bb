SUMMARY = "Documentation for texlive-formlett"
DESCRIPTION = "This package includes the documentation for texlive-formlett"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.3svn21480"

RPM_NAME = "texlive-formlett-doc-2023.209.2.3svn21480-53.1.noarch.rpm"
RPM_HASH = "c39b3a89177a73cdaad05fee6b2e34d93772537caa807827e87d891ccef7efffe8aeadd3760465606155f17d601beba69fb58a38123e66f9c321ead10cf36840"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-formlett-doc"

RDEPENDS:${PN} += ""

inherit rpm
