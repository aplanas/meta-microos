SUMMARY = "Manual for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains the manual for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.14"

RPM_NAME = "ant-manual-1.10.14-1.1.noarch.rpm"
RPM_HASH = "1f52d3bef801656fcccb35db8b84a53c5130997dfb438d1c4338f2b03c65ca78ed8139286d7a517e339450f02d3e8175416f4acf7c43749e980fe2b4430488e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-manual"

RDEPENDS:${PN} += ""

inherit rpm
