SUMMARY = "Java packages filesystem layout"
DESCRIPTION = "This package provides some basic directories into which Java packages \
install their content."
LICENSE = "BSD-3-Clause"

PV = "6.1.0"

RPM_NAME = "javapackages-filesystem-6.1.0-4.1.aarch64.rpm"
RPM_HASH = "c91a4bf3d29a493a427c9e5515ecb69606aa48281e538b18c51622b4617176a4021d5393fb34d98c94e67771c16942f80a9b523bc11f6294085a94bbba81156a"

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
