SUMMARY = "Documentation for the libcdr API"
DESCRIPTION = "This package contains documentation for the libcdr API."
LICENSE = "MPL-2.0"

PV = "0.1.7"

RPM_NAME = "libcdr-devel-doc-0.1.7-1.18.noarch.rpm"
RPM_HASH = "0d292030abf175dc343fc62e9d26b9312b7a51af6d0bbddbd33eff5310d3bc74d0ae6f06317666cb05cfac3978b86b22655dc0eaae8c37ae008ba9fbbe545cb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libcdr-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
