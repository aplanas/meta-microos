SUMMARY = "Cppreference documentation for offline reading - devhelp version"
DESCRIPTION = "Cppreference is a complete online reference for the C and C++ languages and standard libraries, i.e. a more convenient version of the C and C++ standards. This package provides an offline mirror of the reference in the devhelp format. \
 \
This package provides the documentation in the devhelp format."
LICENSE = "CC-BY-SA-3.0"

PV = "20230810"

RPM_NAME = "cppreference-doc-devhelp-20230810-1.1.noarch.rpm"
RPM_HASH = "2f3fa3264458405ab52ec4a08be3e2676f8ce04d74df5fb9d36f664c1e47ff645dac9ab3baeaa5c67a6fbb337e982f3e4fd41a4b3423a450419dc6b2bb89c578"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cppreference-doc-devhelp"

RDEPENDS:${PN} += "cppreference-doc"

inherit rpm
