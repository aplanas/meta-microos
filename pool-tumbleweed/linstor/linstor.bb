SUMMARY = "Binaries of linstor client"
DESCRIPTION = "Binaries of linstor client"
LICENSE = "GPL-3.0-only"

PV = "1.12.0"

RPM_NAME = "linstor-1.12.0-1.11.aarch64.rpm"
RPM_HASH = "668ee0c5a4a252bcd7704a895fd0ed1d7ec6a914656d323d4f73b4c27482165eeb4ee868758485f3502dd82a674de31420c057e02573d9cbe7b14a4b661ed85f"

RPROVIDES:${PN} += "linstor"

RDEPENDS:${PN} += "/usr/bin/python3.11"

inherit rpm
