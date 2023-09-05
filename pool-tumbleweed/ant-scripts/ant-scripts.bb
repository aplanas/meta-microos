SUMMARY = "Additional scripts for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains additional perl and python scripts for Apache \
Ant."
LICENSE = "Apache-2.0"

PV = "1.10.14"

RPM_NAME = "ant-scripts-1.10.14-1.1.noarch.rpm"
RPM_HASH = "a1da1a8a7e4e2196f5d3c2bb042dfe2a9e7d2982bcca74eb6dd6344ca732615a12d69597c4cbb866d52054585a5c8ff4c96c373579567e848616e05e899020e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-scripts"

RDEPENDS:${PN} += "ant \
perl \
python3-base"

inherit rpm
