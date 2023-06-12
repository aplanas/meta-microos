SUMMARY = "RFC 6570 URI Template Processor"
DESCRIPTION = "RFC 6570 URI Template Processor"
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python310-uri-template-1.2.0-3.1.noarch.rpm"
RPM_HASH = "f7d341a8c7af9358e87fa3f9635653642cec1d0ae0096cbdecd7ca6fa77cf28aa604e8209f9402c5b02c48a5f8f4bf019166d4529a85cced25fe30c6353f238a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-uri-template \
python3-uri_template \
python3.10dist(uri-template) \
python310-uri-template \
python310-uri_template \
python3dist(uri-template)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
