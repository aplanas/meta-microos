SUMMARY = "Javadoc for hamcrest"
DESCRIPTION = "Javadoc for hamcrest."
LICENSE = "BSD-3-Clause"

PV = "2.2"

RPM_NAME = "hamcrest-javadoc-2.2-1.4.noarch.rpm"
RPM_HASH = "aee026b4194487b1ba8ebf9f05a586dd388b87f50b79bdb336cf4664357ea0fa6e1e64f3a60e830c50226955e9a317734020a579a38fbd2d57b4eda348e80378"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hamcrest-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
