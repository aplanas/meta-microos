SUMMARY = "Documentation for mtools, a toolset for MS-DOS filesystem access"
DESCRIPTION = "Mtools allows access to an MS-DOS file system on disk without \
mounting it. This subpackage contains the documentation for it."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "4.0.43"

RPM_NAME = "mtools-doc-4.0.43-1.1.aarch64.rpm"
RPM_HASH = "72141c24641a7012c3e7c35cb54f00d421ef5e3b0ba6b0a8a739a71f2b2acb4b49f75b21ef16f556df452c01ea9e8fdf9fe566c530ecfcf4bd9d020de0243804"

RPROVIDES:${PN} += "mtools-doc \
mtools-doc(aarch-64)"

RDEPENDS:${PN} += "mtools"

inherit rpm
