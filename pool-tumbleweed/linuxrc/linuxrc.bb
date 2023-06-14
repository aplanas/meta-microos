SUMMARY = "SUSE Installation Program"
DESCRIPTION = "SUSE installation program."
LICENSE = "GPL-3.0+"

PV = "8.20"

RPM_NAME = "linuxrc-8.20-1.3.aarch64.rpm"
RPM_HASH = "3904099166ccace5816284001bbd6aa45b560a4472767eca7d5951a7ce053a79ee7f44d79f7aef57f597066db80ae222119b7d6ccc749b0f9abc0ff9d27d9986"

RPROVIDES:${PN} += "linuxrc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libcurl.so.4 \
libhd.so.22 \
libmediacheck.so.6 \
libreadline.so.8"

inherit rpm
