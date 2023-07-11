SUMMARY = "Bogofilter documentation"
DESCRIPTION = "This package contains the documentation of bogofilter"
LICENSE = "GPL-2.0-or-later"

PV = "1.2.4"

RPM_NAME = "bogofilter-doc-1.2.4-15.13.noarch.rpm"
RPM_HASH = "b62a16200812fb7515f3aba51c1ceee9ee807836b9dedccf3ca327a151c5bb6b7153203d94b27ab80d6369a05e40c2614cc2add95814e0b8e80c41156584a700"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bogofilter-doc"

RDEPENDS:${PN} += ""

inherit rpm
