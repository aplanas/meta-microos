SUMMARY = "The python pandas[xml] extra"
DESCRIPTION = "This package provides the [xml] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python311-pandas-xml-2.0.3-1.2.noarch.rpm"
RPM_HASH = "e860fbbd5ce49cef516d70027b68d34eb4f945067f776871d2d77595a07a978ddb090dcd18d9962e6c1976c5b56166c970672b6a7f41ccfb6315bb9f7e52b7cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-xml \
python311-pandas-xml"

RDEPENDS:${PN} += "python311-lxml \
python311-pandas"

inherit rpm
