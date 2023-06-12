SUMMARY = "Source code of cel-cpp"
DESCRIPTION = "This is a C++ implementation of a Common Expression Language runtime. \
 \
This package contains source code for cel-cpp."
LICENSE = "Apache-2.0"

PV = "20191127"

RPM_NAME = "cel-cpp-source-20191127-1.9.noarch.rpm"
RPM_HASH = "f61201759cafb14f5f3092fdf6facd19fc378d79cb5f29eb2fa827fbb7cf119a1493250bf034ea8b15b9dbfea7bd0bb3334091c019d3fd9d537625353d71c7bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cel-cpp-source"
RDEPENDS:${PN} += "/bin/bash"

inherit rpm
