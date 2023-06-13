SUMMARY = "CMake modules"
DESCRIPTION = "cmake-fedora consists a set of scripts and cmake modules that simply the \
release process of a *nix software package,  especially for \
Fedora and EPEL."
LICENSE = "BSD-3-Clause"

PV = "2.9.3"

RPM_NAME = "cmake-fedora-modules-2.9.3-1.9.noarch.rpm"
RPM_HASH = "c3e99d8c265e42a9304fea54212417f8923528228a4977abe18639728318f149f98551193a63ec1914c2e10b699a5b5644c9b9184ca2d6906fd61607867ca0c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmake-fedora-modules"

RDEPENDS:${PN} += "cmake"

inherit rpm
