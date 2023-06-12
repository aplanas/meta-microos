SUMMARY = "Development files for PROJ"
DESCRIPTION = "This package contains libproj and the appropriate header files and man pages. \
 \
 \
License:        MIT"
LICENSE = "MIT"

PV = "9.2.0"

RPM_NAME = "proj-devel-9.2.0-1.3.aarch64.rpm"
RPM_HASH = "d869bea6e13b043eaf3263a6060e9e5115350f864ed53128a760769edaf186169ad206572abf67ff116b77fb289488b8a82be9f5f9c28e638fc2cfa2cb4a9a80"

RPROVIDES:${PN} += "cmake(proj) \
cmake(proj4) \
libproj-devel \
pkgconfig(proj) \
proj-devel \
proj-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libproj25 \
pkgconfig(libcurl) \
pkgconfig(libtiff-4) \
pkgconfig(sqlite3)"

inherit rpm
