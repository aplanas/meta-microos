SUMMARY = "Documentation for texlive-roboto"
DESCRIPTION = "This package includes the documentation for texlive-roboto"
LICENSE = "Apache-1.0"

PV = "2023.209.svn64350"

RPM_NAME = "texlive-roboto-doc-2023.209.svn64350-54.1.noarch.rpm"
RPM_HASH = "ab5acad6b50ceea71cf848980906cf7514afe715dac14eae878b372f40a6ae16bdba91aeb0ae29d5eba89d3f147bbe360502e5574621774e5dccb456481ad48d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-roboto-doc"

RDEPENDS:${PN} += ""

inherit rpm
