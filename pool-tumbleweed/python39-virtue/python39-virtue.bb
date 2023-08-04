SUMMARY = "After trial comes virtue. A test runner for good"
DESCRIPTION = "After trial comes virtue. A test runner for good."
LICENSE = "MIT"

PV = "2023.7.5"

RPM_NAME = "python39-virtue-2023.7.5-1.1.noarch.rpm"
RPM_HASH = "c13f6f34f8cd5e79c2454ca09a156bafb72a15b531d23d4ec3d1313ed97ce95f0403de647fd4ab4056950bf4a3932d7d3cdaf9e91a6ab1e8b4b2888781115443"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-virtue \
python39-virtue \
python3dist-virtue"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Twisted \
python39-attrs \
python39-click \
python39-colorama \
python39-pyrsistent \
update-alternatives"

inherit rpm
