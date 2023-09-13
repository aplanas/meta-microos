SUMMARY = "SUSE Linux Base Package (Windows Subsystem for Linux)"
DESCRIPTION = "This package includes some special settings needed on Windows Subsystem \
for Linux. It should only be installed on WSL and not on regular Linux \
systems."
LICENSE = "GPL-2.0-or-later"

PV = "84.87+git20230815.cab7b44"

RPM_NAME = "aaa_base-wsl-84.87+git20230815.cab7b44-1.1.aarch64.rpm"
RPM_HASH = "42e10d13b6be6f553797a07a77588a500d827c45b8b402e0163210498c1c8939543d50a4a0a3575fd9fc34ae240df1f977a5d0523bc589970a5e002cd4aa61c7"

RPROVIDES:${PN} += "aaa-base-wsl"

RDEPENDS:${PN} += "aaa-base"

inherit rpm
