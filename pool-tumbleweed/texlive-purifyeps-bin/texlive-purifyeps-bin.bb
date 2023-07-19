SUMMARY = "Binary files of purifyeps"
DESCRIPTION = "Binary files of purifyeps"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn13663"

RPM_NAME = "texlive-purifyeps-bin-2023.20230311.svn13663-93.1.aarch64.rpm"
RPM_HASH = "bd78e79d873cd5232c71e171ee130fc39ed750bbd8ba7e929d4a7e81b8cc18e6bcaccee783c8c6d48a62f765be118d725ce3d1a174e47e343b84f6911a6e96f6"

RPROVIDES:${PN} += "texlive-purifyeps-bin"

RDEPENDS:${PN} += "texlive-purifyeps"

inherit rpm
