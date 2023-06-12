SUMMARY = "Cppreference documentation for offline reading"
DESCRIPTION = "Cppreference is a complete online reference for the C and C++ languages and standard libraries, i.e. a more convenient version of the C and C++ standards. This package provides an offline mirror of the reference."
LICENSE = "CC-BY-SA-3.0"

PV = "20220730"

RPM_NAME = "cppreference-doc-20220730-3.3.noarch.rpm"
RPM_HASH = "583864eb8a0d6c1e3e119c0c068ea7f189d51e79a06dc853f457d9180c0f6e2a387edfe2f8de71d64e7ec22c395d67c6c99a1900b2dbac392980da93593507ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cppreference-doc"
RDEPENDS:${PN} += ""

inherit rpm
