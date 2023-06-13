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

RPM_NAME = "apache-commons-beanutils-javadoc-1.9.4-3.14.noarch.rpm"
RPM_HASH = "7625fb617792fab912f64b5e25eac083c0a90c4885132b0b26dbf51c3767c7f9df52b60a2c653abb72ffd0a3932fab0f1bdebd7c61bb2790f42c66f09e7a7f81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-beanutils-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
