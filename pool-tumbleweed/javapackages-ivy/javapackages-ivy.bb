SUMMARY = "Local mode for Apache Ivy (files)"
DESCRIPTION = "This package contains files needed by local mode fow Apache Ivy, which \
allows artifact resolution using XMvn resolver."
LICENSE = "BSD-3-Clause"

PV = "6.1.0"

RPM_NAME = "javapackages-ivy-6.1.0-4.1.noarch.rpm"
RPM_HASH = "9fdcde367ba3014237763182acf8f2f87ddb5c61e53753860af741cd11b1f002eb5d5747a48cbbce90a730576f410189d6a554509fcc1a70bd1df20371a64d7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javapackages-ivy"

RDEPENDS:${PN} += "javapackages-local \
javapackages-tools"

inherit rpm
