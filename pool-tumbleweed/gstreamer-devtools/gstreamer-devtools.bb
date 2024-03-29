SUMMARY = "Development and debugging tools for GStreamer"
DESCRIPTION = "Development and debugging tools for GStreamer \
 \
GstValidate detects when elements are not behaving as expected and \
report it to the user so he knows how things are supposed to work \
inside a GstPipeline. In the end, fixing issues found by the tool will \
ensure that all elements behave all together in the expected way. \
 \
The easiest way of using GstValidate is to use one of its command-line \
tools, located at tools/ directory. It is also possible to monitor \
GstPipelines from any application by using the LD_PRELOAD gstvalidate \
lib. The third way of using it is to write your own application that \
links and uses libgstvalidate."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.5"

RPM_NAME = "gstreamer-devtools-1.22.5-1.1.aarch64.rpm"
RPM_HASH = "e634f79ada7a37fdc87b0022d85c80efa540487e09fcc4a4c680a2249ca82278c3e1aaa2315855d6ed81df0fef97a0e7eeb3b026a4385ef36731aba16e0d3003"

RPROVIDES:${PN} += "gstreamer-devtools \
gstreamer-validate"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstrtspserver-1.0.so.0 \
libgsttranscoder-1.0.so.0 \
libgstvalidate-1.0.so.0 \
libgstvideo-1.0.so.0 \
libm.so.6 \
python-abi \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gtk"

inherit rpm
