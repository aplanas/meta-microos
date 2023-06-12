SUMMARY = "Rich client application platform for Java"
DESCRIPTION = "JavaFX/OpenJFX is a set of graphics and media APIs that enables Java \
developers to design, create, test, debug, and deploy rich client \
applications that operate consistently across diverse platforms. \
 \
The media module have been removed due to missing dependencies."
LICENSE = "BSD-3-Clause & GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "17.0.7.0"

RPM_NAME = "openjfx-17.0.7.0-1.1.aarch64.rpm"
RPM_HASH = "d549a3c326a510d9d70fcacf506779a5abbc48e74271a17e6316ae2f107036c94cf2d92f064088d79c293da831e387d7ccbccc73a67122ca94d3b6c97cec080a"

RPROVIDES:${PN} += "libdecora_sse.so()(64bit) \
libglass.so()(64bit) \
libglassgtk2.so()(64bit) \
libglassgtk3.so()(64bit) \
libjavafx_font.so()(64bit) \
libjavafx_font_freetype.so()(64bit) \
libjavafx_font_pango.so()(64bit) \
libjavafx_iio.so()(64bit) \
libprism_common.so()(64bit) \
libprism_es2.so()(64bit) \
libprism_sw.so()(64bit) \
mvn(org.openjfx:javafx.base) \
mvn(org.openjfx:javafx.base:pom:) \
mvn(org.openjfx:javafx.controls) \
mvn(org.openjfx:javafx.controls:pom:) \
mvn(org.openjfx:javafx.fxml) \
mvn(org.openjfx:javafx.fxml:pom:) \
mvn(org.openjfx:javafx.graphics) \
mvn(org.openjfx:javafx.graphics-aggregator:pom:) \
mvn(org.openjfx:javafx.graphics-antlr) \
mvn(org.openjfx:javafx.graphics-antlr:pom:) \
mvn(org.openjfx:javafx.graphics-compileDecora) \
mvn(org.openjfx:javafx.graphics-compileDecora:pom:) \
mvn(org.openjfx:javafx.graphics-compileJava:pom:) \
mvn(org.openjfx:javafx.graphics-compilePrism) \
mvn(org.openjfx:javafx.graphics-compilePrism:pom:) \
mvn(org.openjfx:javafx.graphics-decora) \
mvn(org.openjfx:javafx.graphics-decora:pom:) \
mvn(org.openjfx:javafx.graphics-java) \
mvn(org.openjfx:javafx.graphics-java:pom:) \
mvn(org.openjfx:javafx.graphics-prism) \
mvn(org.openjfx:javafx.graphics-prism:pom:) \
mvn(org.openjfx:javafx.graphics:pom:) \
mvn(org.openjfx:javafx.media) \
mvn(org.openjfx:javafx.media:pom:) \
mvn(org.openjfx:javafx.swing) \
mvn(org.openjfx:javafx.swing:pom:) \
mvn(org.openjfx:javafx.swt) \
mvn(org.openjfx:javafx.swt:pom:) \
mvn(org.openjfx:javafx.web) \
mvn(org.openjfx:javafx.web:pom:) \
mvn(org.openjfx:javafx:pom:) \
mvn(org.openjfx:libdecora_sse:pom:) \
mvn(org.openjfx:libglass:pom:) \
mvn(org.openjfx:libglassgtk2:pom:) \
mvn(org.openjfx:libglassgtk3:pom:) \
mvn(org.openjfx:libjavafx_font:pom:) \
mvn(org.openjfx:libjavafx_font_freetype:pom:) \
mvn(org.openjfx:libjavafx_font_pango:pom:) \
mvn(org.openjfx:libjavafx_iio:pom:) \
mvn(org.openjfx:libprism_common:pom:) \
mvn(org.openjfx:libprism_es2:pom:) \
mvn(org.openjfx:libprism_sw:pom:) \
openjfx \
openjfx(aarch-64)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.35)(64bit) \
mvn(org.antlr:ST4) \
mvn(org.antlr:antlr) \
mvn(org.antlr:antlr-runtime) \
mvn(org.antlr:antlr4) \
mvn(org.antlr:antlr4-runtime) \
mvn(org.antlr:stringtemplate) \
mvn(org.eclipse.swt:swt)"

inherit rpm