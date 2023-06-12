SUMMARY = "Pagure web interface theme used on src.fedoraproject.org"
DESCRIPTION = "This package provides the web interface assets for styling \
a Pagure server with the same look and feel as src.fedoraproject.org."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.13.3"

RPM_NAME = "pagure-theme-srcfpo-5.13.3-1.4.noarch.rpm"
RPM_HASH = "5dd88c65a70c1606ef27f1077673cf090d3bb7060d9208369d937ed6dbf13e6415153e2f788ecceb859047882606d802f504020c682fcc2bf50f760be56cf0c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pagure-theme-srcfpo"
RDEPENDS:${PN} += "pagure"

inherit rpm
