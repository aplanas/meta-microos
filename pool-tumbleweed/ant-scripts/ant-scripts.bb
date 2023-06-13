SUMMARY = "Additional scripts for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains additional perl and python scripts for Apache \
Ant."
LICENSE = "Apache-2.0"

PV = "1.10.13"

RPM_NAME = "ant-scripts-1.10.13-2.1.noarch.rpm"
RPM_HASH = "751be307ad3fc6c9ddd358726c930a4e4a422f0734b622b635cc2ed861003a53b51a1cdecca2fd25ed77932b43ef064e2549e12751d1f15fd7479e0b839b6c85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-scripts"

RDEPENDS:${PN} += "ant \
perl \
python3-base"

inherit rpm
