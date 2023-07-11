SUMMARY = "SUSE Linux Base Package (Windows Subsystem for Linux)"
DESCRIPTION = "This package includes some special settings needed on Windows Subsystem \
for Linux. It should only be installed on WSL and not on regular Linux \
systems."
LICENSE = "GPL-2.0-or-later"

PV = "84.87+git20230329.b39efbc"

RPM_NAME = "aaa_base-wsl-84.87+git20230329.b39efbc-1.2.aarch64.rpm"
RPM_HASH = "030d438a283db09044194bc89b3bbd1d278db66f7efe1655d4cece4d62c88929046de64651c6824428413bc228227cb060ea0b2ffa2243c046fe5c83ca12d112"

RPROVIDES:${PN} += "aaa-base-wsl"

RDEPENDS:${PN} += "aaa-base"

inherit rpm
