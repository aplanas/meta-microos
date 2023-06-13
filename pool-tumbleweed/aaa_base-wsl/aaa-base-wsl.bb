SUMMARY = "SUSE Linux Base Package (Windows Subsystem for Linux)"
DESCRIPTION = "This package includes some special settings needed on Windows Subsystem \
for Linux. It should only be installed on WSL and not on regular Linux \
systems."
LICENSE = "GPL-2.0-or-later"

PV = "84.87+git20230329.b39efbc"

RPM_NAME = "aaa_base-wsl-84.87+git20230329.b39efbc-1.1.aarch64.rpm"
RPM_HASH = "3d55c58cea400b81344a761d013e57f75a581f4af1dd82249cfc3fcf91427f9bbb293e15486051c2ec9a6d38e1fca865f8bec3fdf0df6822a8ca60aa227e7985"

RPROVIDES:${PN} += "aaa_base-wsl \
aaa_base-wsl(aarch-64)"

RDEPENDS:${PN} += "aaa_base"

inherit rpm
