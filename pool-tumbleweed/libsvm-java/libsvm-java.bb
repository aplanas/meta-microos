SUMMARY = "Java bindings for libsvm"
DESCRIPTION = "This package contains the Java bindings for libsvm."
LICENSE = "BSD-3-Clause"

PV = "3.30"

RPM_NAME = "libsvm-java-3.30-1.6.noarch.rpm"
RPM_HASH = "7157660669fc5164013ea72044fac5eb8c2f8b8999cf9bc77cb7abb4efa4dc0ef9cc6146afda3061ef5c2ed44fbef137bba694865bd5bc7de67672d06b150418"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libsvm-java"

RDEPENDS:${PN} += "java \
javapackages-tools \
libsvm3"

inherit rpm
