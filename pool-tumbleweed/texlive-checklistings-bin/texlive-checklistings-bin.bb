SUMMARY = "Binary files of checklistings"
DESCRIPTION = "Binary files of checklistings"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn38300"

RPM_NAME = "texlive-checklistings-bin-2023.20230311.svn38300-92.1.aarch64.rpm"
RPM_HASH = "69081a98f26e3cfa889ce8c3c3ad6e7997a2c8e8ca20edd7992b9c0065c15bd4a0e048143d3cddeaffb0ed915db823a8ad976285c49655843bc1269e978c67cb"

RPROVIDES:${PN} += "texlive-checklistings-bin"

RDEPENDS:${PN} += "texlive-checklistings"

inherit rpm
