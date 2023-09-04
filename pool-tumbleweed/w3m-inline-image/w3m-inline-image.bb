SUMMARY = "An inline image extension for w3m"
DESCRIPTION = "Inline image extension for w3m, the text-based WWW browser. \
 \
When this package is installed w3m can display images inline in an X \
terminal (if it runs in a graphical X Window System environment)."
LICENSE = "ISC"

PV = "0.5.3+git20230121"

RPM_NAME = "w3m-inline-image-0.5.3+git20230121-2.1.aarch64.rpm"
RPM_HASH = "30c257b7b041f3a800d5b9b7d92f129b0b94919a61f99ed188f0f30e6086062b159f714900e54f5a14c1d4c5e42c939d96cc0f31ccefe7dfe1cee3e1b9841ef3"

RPROVIDES:${PN} += "w3m-/usr/lib64/w3m/w3mimgdisplay \
w3m-inline-image"

RDEPENDS:${PN} += "imlib2-loaders \
ld-linux-aarch64.so.1 \
libImlib2.so.1 \
libX11.so.6 \
libc.so.6 \
w3m"

inherit rpm
