SUMMARY = "wxWidgets's XML-based resource system"
DESCRIPTION = "The XML-based resource system of wxWidgets, known as XRC, allows user \
interface elements such as dialogs, menu bars and toolbars, to be \
stored in text files and loaded into the application at run-time."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_qtu_xrc-suse9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "310c8865b56cb1b9792dee17dc3048535f25e2da1bc54113d39729746570b0ff834905de100c38a45ed04857af53a73756a04104ffc82e500ed8bb7a889bc8e1"

RPROVIDES:${PN} += "libwx-qtu-xrc-suse.so.9.0.0 \
libwx-qtu-xrc-suse9-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-baseu-xml-suse.so.9.0.0 \
libwx-qtu-core-suse.so.9.0.0 \
libwx-qtu-html-suse.so.9.0.0"

inherit rpm
