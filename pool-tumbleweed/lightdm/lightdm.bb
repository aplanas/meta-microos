SUMMARY = "Lightweight, Cross-desktop Display Manager"
DESCRIPTION = "LightDM is a lightweight, cross-desktop display manager. Its main \
features are a well-defined greeter API allowing multiple GUIs, \
support for all display manager use cases, with plugins where \
appropriate, low code complexity, and fast performance. Due to its \
cross-platform nature greeters can be written in several toolkits \
such as Qt and GTK+."
LICENSE = "GPL-3.0-or-later"

PV = "1.32.0"

RPM_NAME = "lightdm-1.32.0-2.3.aarch64.rpm"
RPM_HASH = "098c7f5a223096db8a44f09c5a54e54230327e6491addf5735cde70afca53859a36003455db945365abb7b3700891ac4c023c76a71ca880c94f6ea0227afcb0b"

RPROVIDES:${PN} += "config-lightdm \
group-lightdm \
lightdm \
user-lightdm"

RDEPENDS:${PN} += "/usr/bin/sh \
gdmflexiserver \
ld-linux-aarch64.so.1 \
libXdmcp.so.6 \
libaudit.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpam.so.0 \
libxcb.so.1 \
lightdm-greeter \
sysuser-shadow \
xdm"

inherit rpm
