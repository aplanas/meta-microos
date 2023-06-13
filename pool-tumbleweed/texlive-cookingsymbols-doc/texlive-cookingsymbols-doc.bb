SUMMARY = "Documentation for texlive-cookingsymbols"
DESCRIPTION = "This package includes the documentation for texlive-cookingsymbols"
LICENSE = "LPPL-1.0"

PV = "2023.204.1.1svn35929"

RPM_NAME = "texlive-cookingsymbols-doc-2023.204.1.1svn35929-54.1.noarch.rpm"
RPM_HASH = "27e0d0048e94868dab85a2149692213b8a471c8eb9cef4710615a85bfcc701bf426600451e1ad72c262481cf2086504c2af62155c66235a42203896dace5c1e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cookingsymbols-doc"

RDEPENDS:${PN} += ""

inherit rpm
