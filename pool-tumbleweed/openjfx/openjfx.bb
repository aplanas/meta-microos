SUMMARY = "Rich client application platform for Java"
DESCRIPTION = "JavaFX/OpenJFX is a set of graphics and media APIs that enables Java \
developers to design, create, test, debug, and deploy rich client \
applications that operate consistently across diverse platforms. \
 \
The media module have been removed due to missing dependencies."
LICENSE = "BSD-3-Clause & GPL-2.0-only-with-Classpath-exception-2.0"

PV = "17.0.7.0"

RPM_NAME = "openjfx-17.0.7.0-1.2.aarch64.rpm"
RPM_HASH = "bb7ae3ebe7dd3ca085f70d3841d9c4ff0441b8babb0b41ced67caaca54836126662db9fa7122dbbef3490ee006b6a31688e1d7ebbab522fe2660dbb2b8ee778e"

RPROVIDES:${PN} += "libdecora-sse.so \
libglass.so \
libglassgtk2.so \
libglassgtk3.so \
libjavafx-font-freetype.so \
libjavafx-font-pango.so \
libjavafx-font.so \
libjavafx-iio.so \
libprism-common.so \
libprism-es2.so \
libprism-sw.so \
mvn-org.openjfx-javafx-pom- \
mvn-org.openjfx-javafx.base \
mvn-org.openjfx-javafx.base-pom- \
mvn-org.openjfx-javafx.controls \
mvn-org.openjfx-javafx.controls-pom- \
mvn-org.openjfx-javafx.fxml \
mvn-org.openjfx-javafx.fxml-pom- \
mvn-org.openjfx-javafx.graphics \
mvn-org.openjfx-javafx.graphics-aggregator-pom- \
mvn-org.openjfx-javafx.graphics-antlr \
mvn-org.openjfx-javafx.graphics-antlr-pom- \
mvn-org.openjfx-javafx.graphics-compileDecora \
mvn-org.openjfx-javafx.graphics-compileDecora-pom- \
mvn-org.openjfx-javafx.graphics-compileJava-pom- \
mvn-org.openjfx-javafx.graphics-compilePrism \
mvn-org.openjfx-javafx.graphics-compilePrism-pom- \
mvn-org.openjfx-javafx.graphics-decora \
mvn-org.openjfx-javafx.graphics-decora-pom- \
mvn-org.openjfx-javafx.graphics-java \
mvn-org.openjfx-javafx.graphics-java-pom- \
mvn-org.openjfx-javafx.graphics-pom- \
mvn-org.openjfx-javafx.graphics-prism \
mvn-org.openjfx-javafx.graphics-prism-pom- \
mvn-org.openjfx-javafx.media \
mvn-org.openjfx-javafx.media-pom- \
mvn-org.openjfx-javafx.swing \
mvn-org.openjfx-javafx.swing-pom- \
mvn-org.openjfx-javafx.swt \
mvn-org.openjfx-javafx.swt-pom- \
mvn-org.openjfx-javafx.web \
mvn-org.openjfx-javafx.web-pom- \
mvn-org.openjfx-libdecora-sse-pom- \
mvn-org.openjfx-libglass-pom- \
mvn-org.openjfx-libglassgtk2-pom- \
mvn-org.openjfx-libglassgtk3-pom- \
mvn-org.openjfx-libjavafx-font-freetype-pom- \
mvn-org.openjfx-libjavafx-font-pango-pom- \
mvn-org.openjfx-libjavafx-font-pom- \
mvn-org.openjfx-libjavafx-iio-pom- \
mvn-org.openjfx-libprism-common-pom- \
mvn-org.openjfx-libprism-es2-pom- \
mvn-org.openjfx-libprism-sw-pom- \
openjfx"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
ld-linux-aarch64.so.1 \
libc.so.6 \
mvn-org.antlr-ST4 \
mvn-org.antlr-antlr \
mvn-org.antlr-antlr-runtime \
mvn-org.antlr-antlr4 \
mvn-org.antlr-antlr4-runtime \
mvn-org.antlr-stringtemplate \
mvn-org.eclipse.swt-swt"

inherit rpm
