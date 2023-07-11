SUMMARY = "The python pandas[xml] extra"
DESCRIPTION = "This package provides the [xml] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python39-pandas-xml-2.0.2-4.1.noarch.rpm"
RPM_HASH = "52da0fb409e2a9e93498be8190c04d336aaa89444ce63165e7fc32514e573d9a20b98946732400cadf29f71f23b2fc62fee09daa04f2280b8909a104659af3de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-xml"

RDEPENDS:${PN} += "python39-lxml \
python39-pandas"

inherit rpm
