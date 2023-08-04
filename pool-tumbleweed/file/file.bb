SUMMARY = "A Tool to Determine File Types"
DESCRIPTION = "With the file command, you can obtain information on the file type of a \
specified file. File type recognition is controlled by the file \
/etc/magic, which contains the classification criteria. This command is \
used by apsfilter to permit automatic printing of different file types."
LICENSE = "BSD-2-Clause"

PV = "5.45"

RPM_NAME = "file-5.45-1.1.aarch64.rpm"
RPM_HASH = "0d74fc243febc522896621c5e71918410e389f5abe32262eb1e44b716a2a1b10532591f29a2f7d70f3460cf642a6e9914d6af58f33de237809aa772bfd1070c3"

RPROVIDES:${PN} += "file"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmagic.so.1 \
libseccomp.so.2"

inherit rpm
