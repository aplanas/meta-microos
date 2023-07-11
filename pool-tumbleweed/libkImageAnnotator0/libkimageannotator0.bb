SUMMARY = "Tool for annotating images"
DESCRIPTION = "kImageAnnotator is a tool for annotating images."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.1"

RPM_NAME = "libkImageAnnotator0-0.6.1-1.2.aarch64.rpm"
RPM_HASH = "86a83e8dfcaf6a85345c29aa073b6f58f52022a9572646c496606f7544809fac5efe8c7f9d7c3144851f3b1a4f57a679b16ba2cbee1ebc400cea2d0878bfcc92"

RPROVIDES:${PN} += "libkImageAnnotator.so.0 \
libkImageAnnotator0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libkColorPicker.so.0 \
libstdc++.so.6"

inherit rpm
