SUMMARY = "ReStructuredText viewer"
DESCRIPTION = "A viewer for ReStructuredText documents that renders them on the fly."
LICENSE = "GPL-3.0-only"

PV = "3.0.0"

RPM_NAME = "python311-restview-3.0.0-2.4.noarch.rpm"
RPM_HASH = "fd752cc3a471869dea31e804e1438d77f83e35ab5aad7e9872433932397ac5e7fa35a5e6a18e0778f22a3c44c6c0aa3d914e2f05302a1eb70d996f5f1bbda495"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(restview) \
python311-restview \
python3dist(restview)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-docutils \
python311-pygments \
python311-readme_renderer \
update-alternatives"

inherit rpm
