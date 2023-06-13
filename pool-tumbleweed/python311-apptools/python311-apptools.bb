SUMMARY = "Application tools in Python"
DESCRIPTION = "The apptools project includes a set of packages that Enthought has found \
useful in creating a number of applications.  They implement functionality \
that is commonly needed by many applications. \
 \
Part of the Enthought Tool Suite (ETS)."
LICENSE = "BSD-3-Clause & LGPL-2.1-only & LGPL-3.0-only"

PV = "5.2.0"

RPM_NAME = "python311-apptools-5.2.0-1.3.noarch.rpm"
RPM_HASH = "528d3b7861583db966f4e456e986694b5a21c3fa333525e03849d744b870e102d85a55574b11f91a9032144837fbb06106a90c12471cc75fadfdb0be8df712f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(apptools) \
python311-apptools \
python3dist(apptools)"

RDEPENDS:${PN} += "python(abi) \
python311-configobj \
python311-traits"

inherit rpm
