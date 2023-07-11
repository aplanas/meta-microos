SUMMARY = "HTML+JS page generator"
DESCRIPTION = "Generate HTML+JS pages with Python."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python39-branca-0.6.0-2.4.noarch.rpm"
RPM_HASH = "ad95033ad3f3f22e97a7dad0d3c7f6c4b089cf97f55e9062136abfe4bd27b57b9ce89075ffb1e78d9df35f8099a530de5357d8e383827540b97fb7ddb5512c81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-branca \
python39-branca \
python3dist-branca"

RDEPENDS:${PN} += "python-abi \
python39-Jinja2"

inherit rpm
