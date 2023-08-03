SUMMARY = "Documentation for castellan"
DESCRIPTION = "Castellan is a generic Key Manager interface for OpenStack. \
This package contains the documentation"
LICENSE = "Apache-2.0"

PV = "3.11.0"

RPM_NAME = "python-castellan-doc-3.11.0-1.5.noarch.rpm"
RPM_HASH = "461ec17b47d8baf1a4b4102d7a339d8969569195c7c958e20a44df0b57abdbd0c04939a5b8aa8f2343cc01b6ca4f14977fd668441f69d99bfd05a679b65f41bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-castellan-doc"

RDEPENDS:${PN} += ""

inherit rpm
