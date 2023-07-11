SUMMARY = "Extensible application framework for Python"
DESCRIPTION = "Envisage is a Python-based framework for building extensible \
applications, that is, applications whose functionality can be \
extended by adding 'plug-ins'. Envisage provides a standard mechanism \
for features to be added to an application. When building an \
application using Envisage, the entire application consists primarily \
of plug-ins. In this respect, it is similar to the Eclipse and \
Netbeans frameworks for Java applications. \
 \
Part of the Enthought Tool Suite (ETS)."
LICENSE = "BSD-3-Clause & Python-2.0 & LGPL-3.0-only & CC-BY-SA-1.0 & CC-BY-SA-2.0 & CC-BY-SA-2.5 & CC-BY-SA-3.0 & SUSE-Public-Domain"

PV = "6.1.1"

RPM_NAME = "python310-envisage-6.1.1-1.5.noarch.rpm"
RPM_HASH = "646b62deb0d062c42d42a3bf708b3a2cad30ea7d2e0e70d5e414e68545b7901b1f18b2bf8b5e00d8ef5d10b8b1c497445b38fde45e856685613f2b26d2d84ae4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-envisage \
python310-envisage \
python3dist-envisage"

RDEPENDS:${PN} += "python-abi \
python310-traits"

inherit rpm
