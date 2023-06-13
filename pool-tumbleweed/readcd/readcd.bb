SUMMARY = "Program to dump raw CD data to files"
DESCRIPTION = "The readcd program can be used to read optical media and write the \
contents, including subchannels and error correction codes, to files. \
It can be used to write to DVD-RAM too, but other media types should \
use cdrecord which supports a lot more media types."
LICENSE = "CDDL-1.0"

PV = "3.02~a10"

RPM_NAME = "readcd-3.02~a10-47.3.aarch64.rpm"
RPM_HASH = "5b09f10ab0ec7a7fbaef1c507f855e057deba2e4824c784d867c39ee79e9ed01657ec9c9152026052fb7fd16cf946c35e76ede413a35857a182eed6724ffefd9"

RPROVIDES:${PN} += "cdrecord:/usr/bin/readcd \
readcd \
readcd(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcap.so.2()(64bit) \
libcdrdeflt.so.1.0()(64bit) \
libcdrdeflt.so.1.0(SCHILY_1.0)(64bit) \
libedc_ecc_dec.so.1.0()(64bit) \
libedc_ecc_dec.so.1.0(SCHILY_1.0)(64bit) \
librmt.so.1.0()(64bit) \
librmt.so.1.0(SCHILY_1.0)(64bit) \
librmt.so.1.0(SCHILY_1.1)(64bit) \
librscg.so.1.0()(64bit) \
librscg.so.1.0(SCHILY_1.0)(64bit) \
libscg.so.1.0()(64bit) \
libscg.so.1.0(SCHILY_1.0)(64bit) \
libscg.so.1.0(SCHILY_1.1)(64bit) \
libscgcmd.so.1.0()(64bit) \
libscgcmd.so.1.0(SCHILY_1.0)(64bit) \
libschily.so.2.0()(64bit) \
libschily.so.2.0(SCHILY_1.0)(64bit) \
libschily.so.2.0(SCHILY_1.10)(64bit) \
libschily.so.2.0(SCHILY_1.2)(64bit) \
libschily.so.2.0(SCHILY_1.5)(64bit) \
permissions"

inherit rpm
