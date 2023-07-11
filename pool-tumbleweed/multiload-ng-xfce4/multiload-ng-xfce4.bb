SUMMARY = "XFCE4 multiload-ng package"
DESCRIPTION = "Provides required files for XFCE4 panel integration."
LICENSE = "GPL-2.0+"

PV = "git20210103.743885d"

RPM_NAME = "multiload-ng-xfce4-git20210103.743885d-1.8.aarch64.rpm"
RPM_HASH = "013eb16728d7478c8dfb656a432bc5dbc55429d0b5757ecea99847b80decf5e63ee697a1b08265a9244831151f6f1a7df65be1ae63fabd4612b121e50eb299a2"

RPROVIDES:${PN} += "libmultiload-ng.so \
multiload-ng-xfce4"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libxfce4panel-2.0.so.4 \
libxfce4util.so.7 \
multiload-ng-base"

inherit rpm
