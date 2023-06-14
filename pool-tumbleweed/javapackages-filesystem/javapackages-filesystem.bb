SUMMARY = "Java packages filesystem layout"
DESCRIPTION = "This package provides some basic directories into which Java packages \
install their content."
LICENSE = "BSD-3-Clause"

PV = "6.1.0"

RPM_NAME = "javapackages-filesystem-6.1.0-3.1.aarch64.rpm"
RPM_HASH = "7907a9fc8967b0b787c15ba35fff8af044a97ad19387d71cf011e1e2f22ee6ab0de933b9cd83d6d7927ac1c63871e253678c41de0787fbdff93fb6890adb2c09"

RPROVIDES:${PN} += "javapackages-filesystem \
rpm-macro--ivyxmldir \
rpm-macro--javaconfdir \
rpm-macro--javadir \
rpm-macro--javadocdir \
rpm-macro--jnidir \
rpm-macro--jvmcommondatadir \
rpm-macro--jvmcommonlibdir \
rpm-macro--jvmcommonsysconfdir \
rpm-macro--jvmdatadir \
rpm-macro--jvmdir \
rpm-macro--jvmlibdir \
rpm-macro--jvmprivdir \
rpm-macro--jvmsysconfdir \
rpm-macro--mavenpomdir"

RDEPENDS:${PN} += ""

inherit rpm
