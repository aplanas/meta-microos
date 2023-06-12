SUMMARY = "An inline image extension for w3m"
DESCRIPTION = "Inline image extension for w3m, the text-based WWW browser. \
 \
When this package is installed w3m can display images inline in an X \
terminal (if it runs in a graphical X Window System environment)."
LICENSE = "ISC"

PV = "0.5.3+git20230121"

RPM_NAME = "w3m-inline-image-0.5.3+git20230121-1.1.aarch64.rpm"
RPM_HASH = "5f25ba1fcccfe1232b0746405d27574832fec72bc94d6af012147ffc50fb0cb149ea38432a8fc735a04360d865c78a116e279fba3408e292789d15232c9bbc2e"

RPROVIDES:${PN} += "w3m-inline-image \
w3m-inline-image(aarch-64) \
w3m:/usr/lib64/w3m/w3mimgdisplay"
RDEPENDS:${PN} += "imlib2-loaders \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libImlib2.so.1()(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
w3m"

inherit rpm