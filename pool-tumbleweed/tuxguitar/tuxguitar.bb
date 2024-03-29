SUMMARY = "A multitrack tablature editor and player written in Java-SWT"
DESCRIPTION = "TuxGuitar is a guitar tablature editor with player support through midi. It can \
display scores and multitrack tabs. Various features TuxGuitar provides include \
autoscrolling while playing, note duration management, bend/slide/vibrato/ \
hammer-on/pull-off effects, support for tuplets, time signature management, \
tempo management, gp3/gp4/gp5 import and export."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.4"

RPM_NAME = "tuxguitar-1.5.4-5.4.aarch64.rpm"
RPM_HASH = "afbca8889c4d26dd45cb107d17fc91e70dc48fd147ba5bc4f496fb3c040531b115259b53b3967f2a0658fad55453300bd0ab5effdbef68810170f0327349dd09"

RPROVIDES:${PN} += "libtuxguitar-alsa-jni.so \
libtuxguitar-fluidsynth-jni.so \
libtuxguitar-jack-jni.so \
libtuxguitar-oss-jni.so \
mvn-org.herac.tuxguitar-tuxguitar \
mvn-org.herac.tuxguitar-tuxguitar-alsa \
mvn-org.herac.tuxguitar-tuxguitar-alsa-linux-aarch64-pom- \
mvn-org.herac.tuxguitar-tuxguitar-alsa-pom- \
mvn-org.herac.tuxguitar-tuxguitar-ascii \
mvn-org.herac.tuxguitar-tuxguitar-ascii-pom- \
mvn-org.herac.tuxguitar-tuxguitar-awt-graphics \
mvn-org.herac.tuxguitar-tuxguitar-awt-graphics-pom- \
mvn-org.herac.tuxguitar-tuxguitar-browser-ftp \
mvn-org.herac.tuxguitar-tuxguitar-browser-ftp-pom- \
mvn-org.herac.tuxguitar-tuxguitar-community \
mvn-org.herac.tuxguitar-tuxguitar-community-pom- \
mvn-org.herac.tuxguitar-tuxguitar-compat \
mvn-org.herac.tuxguitar-tuxguitar-compat-pom- \
mvn-org.herac.tuxguitar-tuxguitar-converter \
mvn-org.herac.tuxguitar-tuxguitar-converter-pom- \
mvn-org.herac.tuxguitar-tuxguitar-editor-utils \
mvn-org.herac.tuxguitar-tuxguitar-editor-utils-pom- \
mvn-org.herac.tuxguitar-tuxguitar-fluidsynth \
mvn-org.herac.tuxguitar-tuxguitar-fluidsynth-linux-aarch64-pom- \
mvn-org.herac.tuxguitar-tuxguitar-fluidsynth-pom- \
mvn-org.herac.tuxguitar-tuxguitar-gervill \
mvn-org.herac.tuxguitar-tuxguitar-gervill-pom- \
mvn-org.herac.tuxguitar-tuxguitar-gm-settings \
mvn-org.herac.tuxguitar-tuxguitar-gm-settings-pom- \
mvn-org.herac.tuxguitar-tuxguitar-gm-utils \
mvn-org.herac.tuxguitar-tuxguitar-gm-utils-pom- \
mvn-org.herac.tuxguitar-tuxguitar-gpx \
mvn-org.herac.tuxguitar-tuxguitar-gpx-pom- \
mvn-org.herac.tuxguitar-tuxguitar-gtp \
mvn-org.herac.tuxguitar-tuxguitar-gtp-pom- \
mvn-org.herac.tuxguitar-tuxguitar-gtp-ui \
mvn-org.herac.tuxguitar-tuxguitar-gtp-ui-pom- \
mvn-org.herac.tuxguitar-tuxguitar-image \
mvn-org.herac.tuxguitar-tuxguitar-image-pom- \
mvn-org.herac.tuxguitar-tuxguitar-jack \
mvn-org.herac.tuxguitar-tuxguitar-jack-linux-aarch64-pom- \
mvn-org.herac.tuxguitar-tuxguitar-jack-pom- \
mvn-org.herac.tuxguitar-tuxguitar-jack-ui \
mvn-org.herac.tuxguitar-tuxguitar-jack-ui-pom- \
mvn-org.herac.tuxguitar-tuxguitar-jsa \
mvn-org.herac.tuxguitar-tuxguitar-jsa-pom- \
mvn-org.herac.tuxguitar-tuxguitar-lib \
mvn-org.herac.tuxguitar-tuxguitar-lib-pom- \
mvn-org.herac.tuxguitar-tuxguitar-lilypond \
mvn-org.herac.tuxguitar-tuxguitar-lilypond-pom- \
mvn-org.herac.tuxguitar-tuxguitar-lilypond-ui \
mvn-org.herac.tuxguitar-tuxguitar-lilypond-ui-pom- \
mvn-org.herac.tuxguitar-tuxguitar-linux-aarch64-pom- \
mvn-org.herac.tuxguitar-tuxguitar-midi \
mvn-org.herac.tuxguitar-tuxguitar-midi-pom- \
mvn-org.herac.tuxguitar-tuxguitar-midi-ui \
mvn-org.herac.tuxguitar-tuxguitar-midi-ui-pom- \
mvn-org.herac.tuxguitar-tuxguitar-musicxml \
mvn-org.herac.tuxguitar-tuxguitar-musicxml-pom- \
mvn-org.herac.tuxguitar-tuxguitar-oss \
mvn-org.herac.tuxguitar-tuxguitar-oss-linux-aarch64-pom- \
mvn-org.herac.tuxguitar-tuxguitar-oss-pom- \
mvn-org.herac.tuxguitar-tuxguitar-pdf \
mvn-org.herac.tuxguitar-tuxguitar-pdf-pom- \
mvn-org.herac.tuxguitar-tuxguitar-pdf-ui \
mvn-org.herac.tuxguitar-tuxguitar-pdf-ui-pom- \
mvn-org.herac.tuxguitar-tuxguitar-pom- \
mvn-org.herac.tuxguitar-tuxguitar-ptb \
mvn-org.herac.tuxguitar-tuxguitar-ptb-pom- \
mvn-org.herac.tuxguitar-tuxguitar-svg \
mvn-org.herac.tuxguitar-tuxguitar-svg-pom- \
mvn-org.herac.tuxguitar-tuxguitar-synth \
mvn-org.herac.tuxguitar-tuxguitar-synth-gervill \
mvn-org.herac.tuxguitar-tuxguitar-synth-gervill-pom- \
mvn-org.herac.tuxguitar-tuxguitar-synth-pom- \
mvn-org.herac.tuxguitar-tuxguitar-tef \
mvn-org.herac.tuxguitar-tuxguitar-tef-pom- \
mvn-org.herac.tuxguitar-tuxguitar-tray \
mvn-org.herac.tuxguitar-tuxguitar-tray-pom- \
mvn-org.herac.tuxguitar-tuxguitar-tuner \
mvn-org.herac.tuxguitar-tuxguitar-tuner-pom- \
mvn-org.herac.tuxguitar-tuxguitar-ui-toolkit \
mvn-org.herac.tuxguitar-tuxguitar-ui-toolkit-pom- \
mvn-org.herac.tuxguitar-tuxguitar-ui-toolkit-swt \
mvn-org.herac.tuxguitar-tuxguitar-ui-toolkit-swt-pom- \
mvn-org.herac.tuxguitar-tuxguitar-viewer \
mvn-org.herac.tuxguitar-tuxguitar-viewer-pom- \
tuxguitar"

RDEPENDS:${PN} += "/usr/bin/sh \
apache-commons-compress \
eclipse-swt \
java-headless \
javapackages-filesystem \
libasound.so.2 \
libc.so.6 \
libfluidsynth.so.3 \
libjack.so.0 \
mvn-com.itextpdf-itextpdf \
mvn-com.itextpdf.tool-xmlworker"

inherit rpm
