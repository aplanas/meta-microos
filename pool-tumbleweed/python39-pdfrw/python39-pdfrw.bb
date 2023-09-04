SUMMARY = "PDF file reader/writer library"
DESCRIPTION = "pdfrw is a Python library and utility that reads and writes PDF files."
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "python39-pdfrw-0.4-4.1.noarch.rpm"
RPM_HASH = "144f39c56667d6e6aba57400d968867cfaad4c23f3e19d6fbb98f7563a93a9b5477000c1b6ddf32dec068b3e009fe583f64c633fd6fc207085de2296374c06ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pdfrw \
python39-pdfrw \
python3dist-pdfrw"

RDEPENDS:${PN} += "python-abi"

inherit rpm
