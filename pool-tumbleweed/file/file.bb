SUMMARY = "A Tool to Determine File Types"
DESCRIPTION = "With the file command, you can obtain information on the file type of a \
specified file. File type recognition is controlled by the file \
/etc/magic, which contains the classification criteria. This command is \
used by apsfilter to permit automatic printing of different file types."
LICENSE = "BSD-2-Clause"

PV = "5.44"

RPM_NAME = "file-5.44-2.3.aarch64.rpm"
RPM_HASH = "1fbe1e7d05beba8c747c4ce56f3b648d11a7c8d6d12ee0a60e63fef8b69a40ac0680d94c55e1ebcb3b2bc3ef597feeea2cc87b7d09351f9a1d70dd06c68ef4f7"

RPROVIDES:${PN} += "file"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmagic.so.1 \
libseccomp.so.2"

inherit rpm
