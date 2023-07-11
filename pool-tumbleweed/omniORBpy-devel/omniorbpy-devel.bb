SUMMARY = "Header files for omniORBpy"
DESCRIPTION = "omniORBpy-devel contains the omniORBpy development files."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.3.0"

RPM_NAME = "omniORBpy-devel-4.3.0-1.10.aarch64.rpm"
RPM_HASH = "db44c26c5ab90b5e303f3d0ce6794f10b6461063384fc43b44bb64787cc64e1bd1e37879893353d32088ca93c93d8d8559c02644a8df9139322cbbd617a8ed13"

RPROVIDES:${PN} += "omniORBpy-devel"

RDEPENDS:${PN} += "omniORBpy"

inherit rpm
