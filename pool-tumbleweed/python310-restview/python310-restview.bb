SUMMARY = "ReStructuredText viewer"
DESCRIPTION = "A viewer for ReStructuredText documents that renders them on the fly."
LICENSE = "GPL-3.0-only"

PV = "3.0.0"

RPM_NAME = "python310-restview-3.0.0-2.4.noarch.rpm"
RPM_HASH = "c82efe1aaedafa8e025c904197c55d22c1b7df5329945810025db6b3d33ec65d409152fc892061b55a24f4e11b828e189f070286838a26b73fc5a07524568095"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-restview \
python3.10dist-restview \
python310-restview \
python3dist-restview"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-docutils \
python310-pygments \
python310-readme-renderer \
update-alternatives"

inherit rpm
