SUMMARY = "Documentation for libircclient"
DESCRIPTION = "It is designed to be small, fast, portable and compatible to RFC standards and most IRC clients."
LICENSE = "LGPL-2.0-or-later"

PV = "1.10"

RPM_NAME = "libircclient-doc-1.10-1.15.aarch64.rpm"
RPM_HASH = "5822bf1bc6a56fd3d2d56082e9d6f483cc0523de437add9190646bf86602a26a1e565cd20251e57f397b9d620b7c18e32e6bbc71252e50624109caf7ca2fc088"

RPROVIDES:${PN} += "libircclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
