SUMMARY = "Project Management Tool"
DESCRIPTION = "ProjectLibre is a project manager which is compatible with Microsoft \
Project 2003, 2007 and 2010 files. It has Gantt charts, PERT charts, \
network diagrams and Earned Value Costing."
LICENSE = "CPAL-1.0"

PV = "1.9.3"

RPM_NAME = "projectlibre-1.9.3-2.7.noarch.rpm"
RPM_HASH = "6f9435dcf7647ab86adc2a7e65c355fbc5cb95967bb7ab2c3d71df7348018b9fd626b9cb77e0e3a9aeb0fccd077ed230cd5f042eacde399b1e742cc23793e622"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "projectlibre"

RDEPENDS:${PN} += "/usr/bin/sh \
java"

inherit rpm
