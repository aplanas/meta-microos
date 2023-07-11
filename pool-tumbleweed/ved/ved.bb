SUMMARY = "The Visual Editor"
DESCRIPTION = "Ved (visual editor) is a screen-oriented editor that implements a \
user interface somewhere between vi and emacs. It has almost no \
limitations on file size and supports to edit large files (files >2 \
GB)."
LICENSE = "CDDL-1.0"

PV = "1.8"

RPM_NAME = "ved-1.8-47.4.aarch64.rpm"
RPM_HASH = "1e6124ff7b6c18dfde34702dbfbfa16bb7faee0c2a9278a6e43ae0a9753000de8e615ee9caa92859ce1510f00cd6ddddc236ac0bc29f5299f506661ffe037f99"

RPROVIDES:${PN} += "ved"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libschily.so.2.0 \
libxtermcap.so.1.0"

inherit rpm
