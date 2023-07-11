SUMMARY = "ReStructuredText viewer"
DESCRIPTION = "A viewer for ReStructuredText documents that renders them on the fly."
LICENSE = "GPL-3.0-only"

PV = "3.0.0"

RPM_NAME = "python311-restview-3.0.0-2.6.noarch.rpm"
RPM_HASH = "ff4780a4ccd6ead0a2f8d0c08d0832f0230073b61996df33a603c157c243b5f5091d9ae8f68ffe358740b7660815412d10da7c4754bfe93b6432296e099c1e9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-restview \
python3.11dist-restview \
python311-restview \
python3dist-restview"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-docutils \
python311-pygments \
python311-readme-renderer \
update-alternatives"

inherit rpm
