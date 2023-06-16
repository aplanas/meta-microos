SUMMARY = "The 'Phoenix' variant of the wxWidgets Python bindings"
DESCRIPTION = "Phoenix is a reimplementation of wxPython. Like the 'classic' \
wxPython, Phoenix wraps the wxWidgets C++ toolkit and provides access \
to the user interface portions of the wxWidgets API, enabling Python \
applications to have a GUI on Windows, macOS or Unix-like systems, \
with a native look and feel and requiring very little (if any) \
platform specific code."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.0"

RPM_NAME = "python311-wxPython-4.2.0-4.4.aarch64.rpm"
RPM_HASH = "483ded88c03ae71db1d61f7676e6d4bdf279185e57e204a98619074d40585bffe09a6d808ae17179c62dd5ea1f05983bd2460068443faab10b39f0f112922c71"

RPROVIDES:${PN} += "python3.11dist-wxpython \
python311-wxPython \
python311-wxWidgets \
python3dist-wxpython"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-net-suse.so.9.0.0 \
libwx-baseu-suse.so.9.0.0 \
libwx-baseu-xml-suse.so.9.0.0 \
libwx-gtk3u-aui-suse.so.9.0.0 \
libwx-gtk3u-core-suse.so.9.0.0 \
libwx-gtk3u-gl-suse.so.9.0.0 \
libwx-gtk3u-html-suse.so.9.0.0 \
libwx-gtk3u-media-suse.so.9.0.0 \
libwx-gtk3u-propgrid-suse.so.9.0.0 \
libwx-gtk3u-ribbon-suse.so.9.0.0 \
libwx-gtk3u-richtext-suse.so.9.0.0 \
libwx-gtk3u-stc-suse.so.9.0.0 \
libwx-gtk3u-webview-suse.so.9.0.0 \
libwx-gtk3u-xrc-suse.so.9.0.0 \
python-abi \
python311-six \
update-alternatives"

inherit rpm
