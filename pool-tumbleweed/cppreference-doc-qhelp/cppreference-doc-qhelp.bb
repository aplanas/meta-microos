SUMMARY = "Cppreference documentation for offline reading - qhelp version"
DESCRIPTION = "Cppreference is a complete online reference for the C and C++ languages and standard libraries, i.e. a more convenient version of the C and C++ standards. This package provides an offline mirror of the reference in the devhelp format. \
 \
This package provides the documentation in the qhelp format."
LICENSE = "CC-BY-SA-3.0"

PV = "20220730"

RPM_NAME = "cppreference-doc-qhelp-20220730-3.4.noarch.rpm"
RPM_HASH = "0d5d29f2486a600f216c5d56b4dc1f1b271ddbc9e3582a429c6d2cf1b7fb8d82e302e15eec6f162758790c04b1312d00de3b0fcc601fc0c4d40003da949dd389"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cppreference-doc-qhelp"

RDEPENDS:${PN} += "cppreference-doc"

inherit rpm
