SUMMARY = "Cppreference documentation for offline reading"
DESCRIPTION = "Cppreference is a complete online reference for the C and C++ languages and standard libraries, i.e. a more convenient version of the C and C++ standards. This package provides an offline mirror of the reference."
LICENSE = "CC-BY-SA-3.0"

PV = "20220730"

RPM_NAME = "cppreference-doc-20220730-3.4.noarch.rpm"
RPM_HASH = "d05a9b46aa25e3b3d7af4bdd067132e1a079352381406655b7907b329a387ca5d73b6a861e14401a0285c350aebf82267dfd85083ba137eefae91f8deb40cbcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cppreference-doc"

RDEPENDS:${PN} += ""

inherit rpm
