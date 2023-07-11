SUMMARY = "Javadoc for jakarta-commons-beanutils"
DESCRIPTION = "The scope of the Jakarta Commons BeanUtils Package is to create a \
package of Java utility methods for accessing and modifying the \
properties of arbitrary JavaBeans.  No dependencies outside of the JDK \
are required, so the use of this package is very lightweight. \
 \
This package contains the javadoc documentation for the Jakarta Commons \
BeanUtils Package."
LICENSE = "Apache-2.0"

PV = "1.9.4"

RPM_NAME = "apache-commons-beanutils-javadoc-1.9.4-3.15.noarch.rpm"
RPM_HASH = "e7ede62bbfa2045b86ca24a783b22165fe3363d3ac0db2bc13d2d5f6cead32a66edb179e4490a12f1d2eabf0ceccf3ce21b9fdf93dcdf4b5f638f30f4eab6265"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-beanutils-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
