SUMMARY = "Development files for mingw64-winpthreads"
DESCRIPTION = "mingw-w64's implementation of POSIX threads for Windows."
LICENSE = "BSD-3-Clause & MIT"

PV = "10.0.0"

RPM_NAME = "mingw64-winpthreads-devel-10.0.0-1.6.noarch.rpm"
RPM_HASH = "4be0a1e6a03ed1895e342d495c1b4f222017de629a1914cb7688a4674ff798abb7c2ba64ea5aef3a483b8ed112993bf2de424157c2e5240ba86edb6225dd4588"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64(lib:pthread) \
mingw64(lib:winpthread) \
mingw64-unistd-pthread-devel \
mingw64-winpthreads-devel"

RDEPENDS:${PN} += "mingw64-libwinpthread1"

inherit rpm
