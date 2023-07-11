SUMMARY = "A tool to locate Python on the system"
DESCRIPTION = "A Python discovery tool to locate Python on the system."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "python310-pythonfinder-1.3.1-3.6.noarch.rpm"
RPM_HASH = "36ee29e280a97609e413986a1aff60abe1cb478875701343aa795fc62d03614285f0522d3dc5487a35d9ca57ebc80d2265ca8c5b59600c11df082dc17ed38f40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pythonfinder \
python310-pythonfinder \
python3dist-pythonfinder"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-attrs \
python310-cached-property \
python310-click \
python310-packaging \
python310-vistir \
update-alternatives"

inherit rpm
