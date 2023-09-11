SUMMARY = "The python pandas[xml] extra"
DESCRIPTION = "This package provides the [xml] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python310-pandas-xml-2.0.3-1.3.noarch.rpm"
RPM_HASH = "1636c0c375f7f6f2b2ed7be900d59717db324b9d7cfd5592e8750703c44cd8b257d6ed7bfe09f14b9de4c4362160781221543197c26c28203ad47e559231d0c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-xml"

RDEPENDS:${PN} += "python310-lxml \
python310-pandas"

inherit rpm
