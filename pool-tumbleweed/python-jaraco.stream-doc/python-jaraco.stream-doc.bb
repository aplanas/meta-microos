SUMMARY = "Documentation files for python-jaraco.stream"
DESCRIPTION = "This package contains documentation files for python-jaraco.stream."
LICENSE = "MIT"

PV = "3.0.3"

RPM_NAME = "python-jaraco.stream-doc-3.0.3-2.2.noarch.rpm"
RPM_HASH = "23a4bee40d11771f4954494bfed0397c02a84c58466d282e4573c8205b6b3037456de4229cbaaf8b71516f63819d006db3c6f3699ad3fcede8f879b3e6d3f7bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-jaraco.stream-doc \
python310-jaraco.stream-doc \
python311-jaraco.stream-doc \
python39-jaraco.stream-doc"

RDEPENDS:${PN} += ""

inherit rpm
