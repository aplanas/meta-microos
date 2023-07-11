SUMMARY = "Cppreference documentation for offline reading - devhelp version"
DESCRIPTION = "Cppreference is a complete online reference for the C and C++ languages and standard libraries, i.e. a more convenient version of the C and C++ standards. This package provides an offline mirror of the reference in the devhelp format. \
 \
This package provides the documentation in the devhelp format."
LICENSE = "CC-BY-SA-3.0"

PV = "20220730"

RPM_NAME = "cppreference-doc-devhelp-20220730-3.4.noarch.rpm"
RPM_HASH = "0d53e3b4cd8ffdd724a139c5bb7c1c8664e4b57b4d98802927f82dfe0bf52a18e0d0b29da21975620d208d36c14e00751f0ddf3189c2a3b4ee124f965c18f6da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cppreference-doc-devhelp"

RDEPENDS:${PN} += "cppreference-doc"

inherit rpm
