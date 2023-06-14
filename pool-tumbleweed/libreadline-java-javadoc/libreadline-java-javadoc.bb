SUMMARY = "Javadoc for libreadline-java"
DESCRIPTION = "libreadline-java provides Java bindings for libedit though a JNI \
wrapper. This package contains the javadoc documentation for it."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.3"

RPM_NAME = "libreadline-java-javadoc-0.8.3-1.4.aarch64.rpm"
RPM_HASH = "2d19b201d867824691223d8e535d2a3a2eba2586a3932753084a73ca3e0b162bb8b322bcfc99e6b0f3a23572bd53afa018a0782d73929dd9e2efd24585753a6f"

RPROVIDES:${PN} += "libreadline-java-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
