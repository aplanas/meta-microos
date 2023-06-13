SUMMARY = "Java bindings for libsvm"
DESCRIPTION = "This package contains the Java bindings for libsvm."
LICENSE = "BSD-3-Clause"

PV = "3.30"

RPM_NAME = "libsvm-java-3.30-1.4.noarch.rpm"
RPM_HASH = "4cbbe8d5fd4109eee6eacf1e8216ae92f5921b58e1c9694cfe3388508e18584da8b2d18260e1b6623ebd8fa49a6e1e5622b9f1e6d99ba2126ad99fd90e2a8d36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libsvm-java"

RDEPENDS:${PN} += "java \
javapackages-tools \
libsvm3"

inherit rpm
