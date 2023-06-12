SUMMARY = "Documentation for the OpenStack Oslo Cache library"
DESCRIPTION = "Documentation for the OpenStack Oslo cache library."
LICENSE = "Apache-2.0"

PV = "3.3.1"

RPM_NAME = "python-oslo.cache-doc-3.3.1-1.2.noarch.rpm"
RPM_HASH = "b0d104a368aa937004074d51fb02aeb4d2c944fda3a86ca9d172f4d4310467c7899d5d561c7e689ce150690a1ccc7f09aed6d3ae7066667d238e42afab28364d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-oslo.cache-doc"
RDEPENDS:${PN} += ""

inherit rpm
