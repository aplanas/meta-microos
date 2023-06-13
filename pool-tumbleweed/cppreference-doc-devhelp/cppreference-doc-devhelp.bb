SUMMARY = "Cppreference documentation for offline reading - devhelp version"
DESCRIPTION = "Cppreference is a complete online reference for the C and C++ languages and standard libraries, i.e. a more convenient version of the C and C++ standards. This package provides an offline mirror of the reference in the devhelp format. \
 \
This package provides the documentation in the devhelp format."
LICENSE = "CC-BY-SA-3.0"

PV = "20220730"

RPM_NAME = "cppreference-doc-devhelp-20220730-3.3.noarch.rpm"
RPM_HASH = "0638d57add51dba31bb5c653816978057d0bcf7c62648c34730ecf77b19a8420a45ac3f2d2c22dcbdb089345d92dbd3281f023f77a386775a458de0ec752c212"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cppreference-doc-devhelp"

RDEPENDS:${PN} += "cppreference-doc"

inherit rpm
