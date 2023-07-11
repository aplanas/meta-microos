SUMMARY = "Javadoc for uimaj"
DESCRIPTION = "This package contains javadoc for uimaj."
LICENSE = "Apache-2.0"

PV = "2.8.1"

RPM_NAME = "uimaj-javadoc-2.8.1-3.11.noarch.rpm"
RPM_HASH = "87188acc087fa7bc6a8ad82dfdd013b0cb770a14fef8c7fa2675e580724bb3b301046a8e97e0828737e482925c9f19e9196aa643dd3a0fb9346bb04c7f1a8df6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "uimaj-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
