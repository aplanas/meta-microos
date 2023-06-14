SUMMARY = "MATE Search Tool"
DESCRIPTION = "This is the MATE Seach Tool as shipped with the MATE utilities. It uses \
command-line tools such as find and locate to get results."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "mate-search-tool-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "7416556ff556802568b1f7272f28aaac969efc43855faff7c2fa74528a396545b6c651de7ce908c02118bd64350159a3c91f9b50b1e6721f9e54042a664fe79d"

RPROVIDES:${PN} += "mate-search-tool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
mate-desktop-gschemas"

inherit rpm
