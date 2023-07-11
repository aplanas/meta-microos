SUMMARY = "RFC 6570 URI Template Processor"
DESCRIPTION = "RFC 6570 URI Template Processor"
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python39-uri-template-1.2.0-3.3.noarch.rpm"
RPM_HASH = "50febc07a854937643a1a4fcb581098799f383ef3c61c85f8fc0e8dd400d8f5db53d41f6c100042642c90548afcc66477644d6424bcd3991fae16eb30edd3e35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-uri-template \
python39-uri-template \
python3dist-uri-template"

RDEPENDS:${PN} += "python-abi"

inherit rpm
