SUMMARY = "Analog / digital clock for X"
DESCRIPTION = "xclock is the classic X Window System clock utility. It displays \
the time in analog or digital form, continuously updated at a \
frequency which may be specified by the user."
LICENSE = "X11"

PV = "1.1.1"

RPM_NAME = "xclock-1.1.1-1.7.aarch64.rpm"
RPM_HASH = "1f9521abee0bc68e94608d70d246d2a48a9fb01300eeb99ceabd0dd7efef2cc3218ccafc54f33dfeb9820900b08014825dbb2167d25d289b4418d31cfed8359a"

RPROVIDES:${PN} += "xclock"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXft.so.2 \
libXmu.so.6 \
libXrender.so.1 \
libXt.so.6 \
libc.so.6 \
libm.so.6 \
libxkbfile.so.1"

inherit rpm
