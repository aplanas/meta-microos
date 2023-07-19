SUMMARY = "Binary files of texlogfilter"
DESCRIPTION = "Binary files of texlogfilter"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn61780"

RPM_NAME = "texlive-texlogfilter-bin-2023.20230311.svn61780-93.1.aarch64.rpm"
RPM_HASH = "4dc06d35872cc49d635cd0643c8589b40135646bb6e31fd4965d7e96c78b237c1a77b192ffaae1b45ee5e51053651d90d7fbca3b81f21a0537fefd8f4e1d4d69"

RPROVIDES:${PN} += "texlive-texlogfilter-bin"

RDEPENDS:${PN} += "texlive-texlogfilter"

inherit rpm
