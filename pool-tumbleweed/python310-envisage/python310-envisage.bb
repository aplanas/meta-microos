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

RPM_NAME = "python310-envisage-6.1.1-1.3.noarch.rpm"
RPM_HASH = "c2008c7e1ed8ed6dbb7f80fff0e02bf2c24a98b7282967c1b8a24d0726d46fedc6557b653f260336c4a1f5cf9dc90d671dd25c07a6ea63f977ba9a86b0318957"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-envisage \
python3.10dist(envisage) \
python310-envisage \
python3dist(envisage)"
RDEPENDS:${PN} += "python(abi) \
python310-traits"

inherit rpm
