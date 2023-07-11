SUMMARY = "Documentation for mtools, a toolset for MS-DOS filesystem access"
DESCRIPTION = "Mtools allows access to an MS-DOS file system on disk without \
mounting it. This subpackage contains the documentation for it."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "4.0.43"

RPM_NAME = "mtools-doc-4.0.43-1.2.aarch64.rpm"
RPM_HASH = "40f3b22f85a8ffa0c0fc5068bb52780dc4a12e38451ac3deab7a02e55c2cfcba5735d57f608aa4b5435374c1ec9517213d062652f1e7d3a29cc612372d5e9b6b"

RPROVIDES:${PN} += "mtools-doc"

RDEPENDS:${PN} += "mtools"

inherit rpm
