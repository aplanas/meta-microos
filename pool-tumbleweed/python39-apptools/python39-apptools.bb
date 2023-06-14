SUMMARY = "Application tools in Python"
DESCRIPTION = "The apptools project includes a set of packages that Enthought has found \
useful in creating a number of applications.  They implement functionality \
that is commonly needed by many applications. \
 \
Part of the Enthought Tool Suite (ETS)."
LICENSE = "BSD-3-Clause & LGPL-2.1-only & LGPL-3.0-only"

PV = "5.2.0"

RPM_NAME = "python39-apptools-5.2.0-1.3.noarch.rpm"
RPM_HASH = "334063a47ff965a02a9828b4a3fb63d82e0c5322f8f659950bff9be1b1c77127a46ad161582f5a958520aea3cb32b5aeee66c17a1e44da68f67ac273a0a7c39d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-apptools \
python39-apptools \
python3dist-apptools"

RDEPENDS:${PN} += "python-abi \
python39-configobj \
python39-traits"

inherit rpm
