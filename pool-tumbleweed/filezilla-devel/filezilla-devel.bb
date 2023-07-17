SUMMARY = "Development files for filezilla"
DESCRIPTION = "This are development files for filezilla."
LICENSE = "GPL-2.0-or-later"

PV = "3.65.0"

RPM_NAME = "filezilla-devel-3.65.0-1.1.aarch64.rpm"
RPM_HASH = "6b7fa5594f38fb24512906a9d25e4827eab531cad980721971aa272b7d023918359db4d5bdeda8ebab86fbcb738a7088efd3745996fffc927dacff940626987c"

RPROVIDES:${PN} += "filezilla-devel"

RDEPENDS:${PN} += "filezilla"

inherit rpm
