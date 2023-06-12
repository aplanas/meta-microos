SUMMARY = "ReStructuredText viewer"
DESCRIPTION = "A viewer for ReStructuredText documents that renders them on the fly."
LICENSE = "GPL-3.0-only"

PV = "3.0.0"

RPM_NAME = "python39-restview-3.0.0-2.4.noarch.rpm"
RPM_HASH = "87368599296e57eee607181febad9ca1771872db074673d1dadf51997c53df269d63317755154a386af2ae6be05bfa468786c975b1503a8a750b3d2ac232bed1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(restview) \
python39-restview \
python3dist(restview)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-docutils \
python39-pygments \
python39-readme_renderer \
update-alternatives"

inherit rpm
