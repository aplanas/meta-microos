SUMMARY = "Data files for sar2"
DESCRIPTION = "Data files for Search and Rescue II"
LICENSE = "GPL-2.0-only"

PV = "2.5.0"

RPM_NAME = "sar2-data-2.5.0-2.4.noarch.rpm"
RPM_HASH = "f63976b858e3365f00ad39c705f0c958ebcdc06243e339b4a2084cd651d4bf37251d28189e59daf372ab908e49430d6916be2ae0591a9a9a6375fc805aa7ba6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sar2-data"

RDEPENDS:${PN} += "sar2"

inherit rpm
