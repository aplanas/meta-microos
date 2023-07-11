SUMMARY = "Console Mouse Support"
DESCRIPTION = "The gpm (general purpose mouse) daemon is a mouse server for \
applications running on the Linux console. It provides cut and paste \
operations. If a gpm-aware program, such as mc (Midnight Commander) \
or w3m (a text-based web browser), is active, they will use to gpm to \
receive mouse events and do custom handling."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.20.7"

RPM_NAME = "gpm-1.20.7-19.15.aarch64.rpm"
RPM_HASH = "7273d49ca8d2e35676dbca058d78f51664f757b23be54cba1e0bbb6cdab464697ce2f4068b728a57614e9394d8b02ef50c2dce504d2e7366a7b552fa4866feea"

RPROVIDES:${PN} += "config-gpm \
gpm \
select"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sed \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgpm.so.2 \
systemd"

inherit rpm
