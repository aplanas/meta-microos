SUMMARY = "Binary files of texosquery"
DESCRIPTION = "Binary files of texosquery"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn43596"

RPM_NAME = "texlive-texosquery-bin-2023.20230311.svn43596-92.1.aarch64.rpm"
RPM_HASH = "33845a0e66f1a1353b49932cedc706a210113501fe4f13cd5dd202d9ead520ca6b264a27d359e17017b385324c5d38687270079a9a389d3cc24bd76aa7e3e325"

RPROVIDES:${PN} += "texlive-texosquery-bin"

RDEPENDS:${PN} += "texlive-texosquery"

inherit rpm
