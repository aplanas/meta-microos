SUMMARY = "MATE Search Tool"
DESCRIPTION = "This is the MATE Seach Tool as shipped with the MATE utilities. It uses \
command-line tools such as find and locate to get results."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "mate-search-tool-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "7416556ff556802568b1f7272f28aaac969efc43855faff7c2fa74528a396545b6c651de7ce908c02118bd64350159a3c91f9b50b1e6721f9e54042a664fe79d"

RPROVIDES:${PN} += "application() \
application(mate-search-tool.desktop) \
mate-search-tool \
mate-search-tool(aarch-64) \
metainfo() \
metainfo(mate-search-tool.appdata.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libICE.so.6()(64bit) \
libSM.so.6()(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
mate-desktop-gschemas"

inherit rpm
