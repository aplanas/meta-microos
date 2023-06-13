SUMMARY = "Documentation for texlive-boldtensors"
DESCRIPTION = "This package includes the documentation for texlive-boldtensors"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-boldtensors-doc-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "2c41753eb64780a17328345aac2a5ca0b30010006aa44663f73e4d7c8762f860aed058cf4652a8427043b9125e6fbae373064e5a70f126400fd64623239c93cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-boldtensors-doc"

RDEPENDS:${PN} += ""

inherit rpm
