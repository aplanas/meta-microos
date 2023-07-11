SUMMARY = "Compare Files Side by Side"
DESCRIPTION = "Mgdiff is a graphical front-end to the Unix diff command based on X11 \
and the Motif widget set. It allows the user to select two files for \
comparison, runs the diff command, parses the output and presents the \
results graphically. \
 \
 \
 \
Authors: \
-------- \
    Daniel Williams <dan@sass.com>"
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "mgdiff-1.0.1-7.28.aarch64.rpm"
RPM_HASH = "0855c75adff7ff0d72635a1dd50c50553d4eb702f5d961f41231e455d5447fb12f85c55b116ab4fdaa56ea6ae71684777a7bddcdf24e2d762fa17560f21cc3f1"

RPROVIDES:${PN} += "mgdiff"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXm.so.4 \
libXt.so.6 \
libc.so.6"

inherit rpm
