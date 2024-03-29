SUMMARY = "Program to dump raw CD data to files"
DESCRIPTION = "The readcd program can be used to read optical media and write the \
contents, including subchannels and error correction codes, to files. \
It can be used to write to DVD-RAM too, but other media types should \
use cdrecord which supports a lot more media types."
LICENSE = "CDDL-1.0"

PV = "3.02~a10"

RPM_NAME = "readcd-3.02~a10-47.4.aarch64.rpm"
RPM_HASH = "fdd3b13e8721cf9660a8ce1637630724005f5b2070c26b69aaead2d75f2efbe2fd42d404b9fb1d8f6c7a5c8baa21886a86df2ad7a6d0e94e80ffad8c7509ae7f"

RPROVIDES:${PN} += "cdrecord-/usr/bin/readcd \
readcd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libcdrdeflt.so.1.0 \
libedc-ecc-dec.so.1.0 \
librmt.so.1.0 \
librscg.so.1.0 \
libscg.so.1.0 \
libscgcmd.so.1.0 \
libschily.so.2.0 \
permissions"

inherit rpm
