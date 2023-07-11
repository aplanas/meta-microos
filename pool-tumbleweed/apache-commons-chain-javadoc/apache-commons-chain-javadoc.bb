SUMMARY = "Javadoc for apache-commons-chain"
DESCRIPTION = "This package contains javadoc for apache-commons-chain."
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "apache-commons-chain-javadoc-1.2-2.7.noarch.rpm"
RPM_HASH = "d06a2953be117f116b874410246f8fab0ddae2f602ba3af2e8b42979d0d45840a944f1668bf4a8036991b926866fdf6c3bdf7b432796e4647400e335473fd229"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-chain-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
