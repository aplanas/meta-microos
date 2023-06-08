SUMMARY = "API files for eric6"
DESCRIPTION = "This package provides API files for eric6. \
If both python-eric6 and python3-eric6 packages are installed then only one \
python-eric6-api or python3-eric6-api is needed."
LICENSE = "GPL-3.0-or-later"

PV = "23.4.2"

RPM_NAME = "eric-api-23.4.2-1.1.noarch.rpm"
RPM_HASH = "c28fabc85c4462ce6fa8238a67ea7f0933d35026a1053e2243d78898ec0bbd4a948116bf049a2963d788dba3ccc8f4254dfaa26027e27dec72d1daf47dd86d25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eric-api eric5-api eric6-api python-eric5-api python-eric6-api"
RDEPENDS:${PN} += ""

inherit rpm
