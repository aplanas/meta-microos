SUMMARY = "Java port of Mozilla's automatic character set detection algorithm"
DESCRIPTION = "jchardet is a java port of the source from Mozilla's automatic charset \
detection algorithm. The original author is Frank Tang. What is available \
here is the java port of that code. The original source in C++ can be found \
from http://lxr.mozilla.org/mozilla/source/intl/chardet/. More information can \
be found at http://www.mozilla.org/projects/intl/chardet.html."
LICENSE = "GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later"

PV = "1.1"

RPM_NAME = "jchardet-1.1-2.7.noarch.rpm"
RPM_HASH = "b0db4e239eb3f0548cec9ec897e95abdd26d7c5d9347987e6fdbd1ddbdaf462e7bc7c39cb0e69983daa9c0e80d8fb7c5c400055f90402bc047c8331bcad17c40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jchardet \
mvn-net.sourceforge.jchardet-jchardet \
mvn-net.sourceforge.jchardet-jchardet-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
