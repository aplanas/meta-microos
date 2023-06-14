SUMMARY = "wxWidgets's XML-based resource system"
DESCRIPTION = "The XML-based resource system of wxWidgets, known as XRC, allows user \
interface elements such as dialogs, menu bars and toolbars, to be \
stored in text files and loaded into the application at run-time."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk2u_xrc-suse9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "1dbb58323f34e56f1b5bbe47fef146cd4b3669bea53186af2d26adcfbe295a7111488c719f896f8871eddeb9fbb0eef4515fc9fcdba7c7f92fb1dc159d6bcac9"

RPROVIDES:${PN} += "libwx-gtk2u-xrc-suse.so.9.0.0 \
libwx-gtk2u-xrc-suse9-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-baseu-xml-suse.so.9.0.0 \
libwx-gtk2u-core-suse.so.9.0.0 \
libwx-gtk2u-html-suse.so.9.0.0"

inherit rpm
