SUMMARY = "Parent pom file for codehaus projects"
DESCRIPTION = "This package contains the parent pom file for codehaus projects."
LICENSE = "Apache-2.0"

PV = "4"

RPM_NAME = "codehaus-parent-4-1.11.noarch.rpm"
RPM_HASH = "859980f800380dfffc4c09d313c4483ff831b7610046be08aaf51b02a33f787376338b4a33ed0916b0f856a7428764df48ab71c2987856a2405635e6e1b16bca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "codehaus-parent \
mvn(org.codehaus:codehaus-parent:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
