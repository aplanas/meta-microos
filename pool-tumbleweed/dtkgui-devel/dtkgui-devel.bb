SUMMARY = "Development tools for dtkgui"
DESCRIPTION = "The dtkgui-devel package contains the header files and developer docs for \
dtkgui. \
 \
You should first read the 'Deepin Application Specification'."
LICENSE = "LGPL-3.0"

PV = "5.5.25"

RPM_NAME = "dtkgui-devel-5.5.25-1.9.aarch64.rpm"
RPM_HASH = "78edfb189b7dc71ff396dc222ac0567ad5765ef79a395d3bb080481ad0e1af02932a5e7853a3aae644b19185069178381b0e795594da7433b05d3e555055ebc1"

RPROVIDES:${PN} += "cmake-DtkGui \
dtkgui-devel \
pkgconfig-dtkgui"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdtkgui5 \
pkgconfig-dtkcore"

inherit rpm
