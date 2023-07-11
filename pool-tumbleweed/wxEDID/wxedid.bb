SUMMARY = "Extended Display Identification Data editor"
DESCRIPTION = "wxEDID is a wxWidgets - based EDID (Extended Display Identification Data) editor. \
This is an early stage of development, allowing to modify the base EDID v1.3+ \
structure and CEA-861 (as first extension block). \
Besides normal editor functionality, the app has been equipped with a DTD \
constructor, which aims to ease timings selection/editing. It's also possible to \
export and import EDID data to/from text files (hex ASCII format) and also to \
save the structures as a human-readable text."
LICENSE = "GPL-3.0-only"

PV = "0.0.29"

RPM_NAME = "wxEDID-0.0.29-1.2.aarch64.rpm"
RPM_HASH = "15e0f7de8509bd18ba126d9b28151474876870eaaf0a6747360ebca6042f4afd5c7790ef682550fc3338f51dced5b78e90cdf34f2bfc915653b430b76423a3de"

RPROVIDES:${PN} += "wxEDID"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk2u-aui-suse.so.9.0.0 \
libwx-gtk2u-core-suse.so.9.0.0"

inherit rpm
