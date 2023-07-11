SUMMARY = "Binary files of texlogfilter"
DESCRIPTION = "Binary files of texlogfilter"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn61780"

RPM_NAME = "texlive-texlogfilter-bin-2023.20230311.svn61780-92.1.aarch64.rpm"
RPM_HASH = "c03606403beee032f9cfd256b72a94559fb32daf4539fbeaf230fa4f554e62a0efb2b6b82b26fc8542b3f781cdf4b9cf75afb1336d0258d5f4b5f5c65c83c2a6"

RPROVIDES:${PN} += "texlive-texlogfilter-bin"

RDEPENDS:${PN} += "texlive-texlogfilter"

inherit rpm
