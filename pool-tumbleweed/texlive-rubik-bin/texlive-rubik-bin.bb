SUMMARY = "Binary files of rubik"
DESCRIPTION = "Binary files of rubik"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn32919"

RPM_NAME = "texlive-rubik-bin-2023.20230311.svn32919-93.2.aarch64.rpm"
RPM_HASH = "8e92c95a545aee31e16d4fdd85b4fe483a8dee7117aef1779895b4e960e2daaac4c6ab4326c2ceafc8f63fab19170d92d42adf8feab8bdf8a7b16b925c2fe5f1"

RPROVIDES:${PN} += "texlive-rubik-bin"

RDEPENDS:${PN} += "texlive-rubik"

inherit rpm
