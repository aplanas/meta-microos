SUMMARY = "Cppreference documentation for offline reading - qhelp version"
DESCRIPTION = "Cppreference is a complete online reference for the C and C++ languages and standard libraries, i.e. a more convenient version of the C and C++ standards. This package provides an offline mirror of the reference in the devhelp format. \
 \
This package provides the documentation in the qhelp format."
LICENSE = "CC-BY-SA-3.0"

PV = "20230810"

RPM_NAME = "cppreference-doc-qhelp-20230810-1.1.noarch.rpm"
RPM_HASH = "61d6a3d833626db6d2e5836014e5185ed5269cbb8d888b3a64c29dee28c3669e8b2a8e129a0affc34f0e0e8657d6c350778cd4aa08eb24c00e1b3c6f459c38a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cppreference-doc-qhelp"

RDEPENDS:${PN} += "cppreference-doc"

inherit rpm
