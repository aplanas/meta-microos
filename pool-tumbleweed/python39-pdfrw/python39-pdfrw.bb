SUMMARY = "PDF file reader/writer library"
DESCRIPTION = "pdfrw is a Python library and utility that reads and writes PDF files."
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "python39-pdfrw-0.4-3.17.noarch.rpm"
RPM_HASH = "bed5e21e5c7f736dd6b3d2c393f42a4af4cef2a2395df4343bab176f6cc136849099be7fb90fbe620010dff8bf4ff5a1106b72c7ad502e371a60e55715acbcf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pdfrw \
python39-pdfrw \
python3dist-pdfrw"

RDEPENDS:${PN} += "python-abi"

inherit rpm
