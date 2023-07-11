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

RPM_NAME = "python311-envisage-6.1.1-1.5.noarch.rpm"
RPM_HASH = "4696f8cdf8d9f7b92dd1ec47f392d1c2133b97303717037c98c4b296858af889f0073be7265e0bcf61b3eb41e1401c5538b6ed4765d0b255d6f910918de2023f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-envisage \
python3.11dist-envisage \
python311-envisage \
python3dist-envisage"

RDEPENDS:${PN} += "python-abi \
python311-traits"

inherit rpm
