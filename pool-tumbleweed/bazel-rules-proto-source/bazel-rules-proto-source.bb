SUMMARY = "Source code of bazel-rules-proto"
DESCRIPTION = "bazel-rules-proto is a set of Bazel rules for building Protocol Buffers. \
 \
This package contains source code of bazel-rules-proto."
LICENSE = "Apache-2.0"

PV = "20190801"

RPM_NAME = "bazel-rules-proto-source-20190801-1.10.noarch.rpm"
RPM_HASH = "d99b7d03471297c921448c583620d90ada85ac393298a2352a3ef7ba5955d2d39902f99284f42d2baa0d5c407065bab7b47ca1ce8465abdbaf666db4efd6620b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bazel-rules-proto-source"

RDEPENDS:${PN} += ""

inherit rpm
