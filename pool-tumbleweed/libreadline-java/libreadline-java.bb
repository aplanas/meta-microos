SUMMARY = "Java Wrapper for the EditLine Library"
DESCRIPTION = "libreadline-java provides Java bindings for libedit though a JNI \
wrapper."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.3"

RPM_NAME = "libreadline-java-0.8.3-1.5.aarch64.rpm"
RPM_HASH = "55a41cfc3a903bc9e1254a8f50fd80e54d56060af7e4ec3bc335fc7aaed93ed45abfeb2d623c33b91834ec51bdd36e5dfcab8b5be33a019fb1245d508ca10b4a"

RPROVIDES:${PN} += "gnu.readline \
java-readline \
libJavaEditline.so \
libreadline-java"

RDEPENDS:${PN} += "java \
libc.so.6 \
libedit \
libedit.so.0"

inherit rpm
