SUMMARY = "Include files for the GnuCOBOL shared library"
DESCRIPTION = "GnuCOBOL (formerly OpenCOBOL) is a COBOL compiler. \
cobc translates COBOL to executable using intermediate C sources, \
providing full access to nearly all C libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "3.1.2"

RPM_NAME = "libcob-devel-3.1.2-1.14.aarch64.rpm"
RPM_HASH = "04c8f12b4156c61fb807434378d8536651cc57bbeec06a43becbc86f1191e49c27f2844179fa21328b5e5371f99cc55bfcbaf62777f4480f0eb1b4bdf21abed5"

RPROVIDES:${PN} += "libcob-devel"

RDEPENDS:${PN} += "libcob4"

inherit rpm
