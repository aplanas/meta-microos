SUMMARY = "Java packages filesystem layout"
DESCRIPTION = "This package provides some basic directories into which Java packages \
install their content."
LICENSE = "BSD-3-Clause"

PV = "6.2.0"

RPM_NAME = "javapackages-filesystem-6.2.0-2.1.aarch64.rpm"
RPM_HASH = "39d964d8fd6308de9d2ba70f00a3a5fcabbcbd3dd1933d1daa36284f4fb7895d272c7cb1b7ad5c47b9684e581288f150aa8cbb3b463ed22f853d5db0df187f60"

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
