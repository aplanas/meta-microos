SUMMARY = "Development files of mmtf-cpp"
DESCRIPTION = "This package contains libraries and header files for developing \
applications that use mmtf-cpp."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "mmtf-cpp-devel-1.1.0-1.2.noarch.rpm"
RPM_HASH = "b6eba2a258e0effb15cd10c4082bd15b1fc6f59755545d1c340e199b4d12db8d83d5d3c2102f2573c36705b48636fb671f4829f4b4eaba4652fb9dc0c90f5bd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mmtf-cpp-devel"

RDEPENDS:${PN} += "msgpack-cxx-devel"

inherit rpm
