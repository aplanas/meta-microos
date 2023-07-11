SUMMARY = "Application tools in Python"
DESCRIPTION = "The apptools project includes a set of packages that Enthought has found \
useful in creating a number of applications.  They implement functionality \
that is commonly needed by many applications. \
 \
Part of the Enthought Tool Suite (ETS)."
LICENSE = "BSD-3-Clause & LGPL-2.1-only & LGPL-3.0-only"

PV = "5.2.0"

RPM_NAME = "python39-apptools-5.2.0-1.5.noarch.rpm"
RPM_HASH = "431979c068733d52cdfe6ce64d890e1e76f69ef2bf97db74cb6479cb8e21e9ba5e87f8602d099f6b7c9be850b99f4d18c640c18c311a8c2e4a275c95e3210d4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-apptools \
python39-apptools \
python3dist-apptools"

RDEPENDS:${PN} += "python-abi \
python39-configobj \
python39-traits"

inherit rpm
