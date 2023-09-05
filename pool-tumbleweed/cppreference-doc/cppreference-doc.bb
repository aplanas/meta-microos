SUMMARY = "Cppreference documentation for offline reading"
DESCRIPTION = "Cppreference is a complete online reference for the C and C++ languages and standard libraries, i.e. a more convenient version of the C and C++ standards. This package provides an offline mirror of the reference."
LICENSE = "CC-BY-SA-3.0"

PV = "20230810"

RPM_NAME = "cppreference-doc-20230810-1.1.noarch.rpm"
RPM_HASH = "a3e966b3f6e98ab2ae31d403c3bb2fcf7784a0d3baae59339a1546301ef5e62873f55d85e9c290d621eb89c18c510bba1d72a580a18ee3051501013a74d80cea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cppreference-doc"

RDEPENDS:${PN} += ""

inherit rpm
