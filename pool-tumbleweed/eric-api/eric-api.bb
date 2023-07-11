SUMMARY = "API files for eric6"
DESCRIPTION = "This package provides API files for eric6. \
If both python-eric6 and python3-eric6 packages are installed then only one \
python-eric6-api or python3-eric6-api is needed."
LICENSE = "GPL-3.0-or-later"

PV = "23.4.2"

RPM_NAME = "eric-api-23.4.2-1.2.noarch.rpm"
RPM_HASH = "95c9590c8ac4657ea22e046a0f31b250d515121a84d750488484bf1fc7470e3156ac91fd27c844a72326c085451ab456c2a034d82d13faed60a8acc3bfd1c531"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eric-api \
eric5-api \
eric6-api \
python-eric5-api \
python-eric6-api"

RDEPENDS:${PN} += ""

inherit rpm
