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

RPM_NAME = "python311-envisage-6.1.1-1.3.noarch.rpm"
RPM_HASH = "7e1c55706b9322839c7d488e11e324729605d3f925673515c068434aa28998041b2f519633be46f249c9648a4b5a3fe5079af76e9e9612814a5fac85f1ca8260"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-envisage \
python311-envisage \
python3dist-envisage"

RDEPENDS:${PN} += "python-abi \
python311-traits"

inherit rpm
