SUMMARY = "Development files for filezilla"
DESCRIPTION = "This are development files for filezilla."
LICENSE = "GPL-2.0-or-later"

PV = "3.63.2.1"

RPM_NAME = "filezilla-devel-3.63.2.1-2.2.aarch64.rpm"
RPM_HASH = "1c34f789141ca4a5a731c4992ff86b62909da37b26a2911108a1c45039e7f2c998d30fa8257aca52541b4065558c1beb8c435b345885258aaa405c7d753735eb"

RPROVIDES:${PN} += "filezilla-devel filezilla-devel(aarch-64)"
RDEPENDS:${PN} += "filezilla"

inherit rpm
