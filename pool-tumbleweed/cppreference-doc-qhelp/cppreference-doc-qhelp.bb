SUMMARY = "Cppreference documentation for offline reading - qhelp version"
DESCRIPTION = "Cppreference is a complete online reference for the C and C++ languages and standard libraries, i.e. a more convenient version of the C and C++ standards. This package provides an offline mirror of the reference in the devhelp format. \
 \
This package provides the documentation in the qhelp format."
LICENSE = "CC-BY-SA-3.0"

PV = "20220730"

RPM_NAME = "cppreference-doc-qhelp-20220730-3.3.noarch.rpm"
RPM_HASH = "c5b302f3868e361ff7c9d580dd35450768fdbe73d538a5a9ee3ddaf7554610fe3c01ace10ebb1ad7119247898d89ddf6860eee2691639e5a7cc7e85bf16248c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cppreference-doc-qhelp"
RDEPENDS:${PN} += "cppreference-doc"

inherit rpm
