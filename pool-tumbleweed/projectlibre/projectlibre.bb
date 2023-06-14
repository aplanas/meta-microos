SUMMARY = "Project Management Tool"
DESCRIPTION = "ProjectLibre is a project manager which is compatible with Microsoft \
Project 2003, 2007 and 2010 files. It has Gantt charts, PERT charts, \
network diagrams and Earned Value Costing."
LICENSE = "CPAL-1.0"

PV = "1.9.3"

RPM_NAME = "projectlibre-1.9.3-2.6.noarch.rpm"
RPM_HASH = "beee02dffd6c481589240e1009616562b1e4dc3902048c7c750a5fd5f5b55319510991af179f9c55520b57a04d77833eb13d02460da9c41c0c14055a2295a63d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "projectlibre"

RDEPENDS:${PN} += "/bin/sh \
java"

inherit rpm
