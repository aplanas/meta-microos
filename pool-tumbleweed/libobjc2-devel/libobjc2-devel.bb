SUMMARY = "Header files for the GNUstep Objective-C runtime"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications with the GNUstep Objective-C runtime."
LICENSE = "MIT"

PV = "2.1"

RPM_NAME = "libobjc2-devel-2.1-2.3.aarch64.rpm"
RPM_HASH = "4fa81b463030cad25152c2aa800dd6ee857a75c0db8c210fd7d342b3978775d3e372e5cf95fe4baf7fb563afe4f411b27845388a870a574ac4a3230f64bc7f9d"

RPROVIDES:${PN} += "libobjc2-devel \
libobjc2-devel(aarch-64) \
pkgconfig(libobjc)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libobjc4_6"

inherit rpm
