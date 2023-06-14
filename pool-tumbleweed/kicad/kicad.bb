SUMMARY = "EDA software suite for the creation of schematics and PCB"
DESCRIPTION = "KiCad is an open source (GPL) software for the creation of electronic \
schematic diagrams and printed circuit with up to 32 copper layers and \
additional technical layers. \
 \
KiCad includes a project manager and four main independent software tools: \
- Eeschema: schematic editor. \
- Pcbnew: printed circuit board editor. \
- Gerbview: GERBER file viewer (photoplotter documents). \
- Cvpcb: footprint selector for components association."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-or-later"

PV = "7.0.5"

RPM_NAME = "kicad-7.0.5-1.1.aarch64.rpm"
RPM_HASH = "eab54956fad873d26df37aa9d593449d7217f797550059913d194397895256908af14d9ec4e77152922ae02c6457781204f5428f61b2f8d6448504390363594d"

RPROVIDES:${PN} += "kicad \
libkicad-3dsg.so.2.0.0 \
libs3d-plugin-idf.so \
libs3d-plugin-oce.so \
libs3d-plugin-vrml.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
kicad-footprints \
kicad-symbols \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLEW.so.2.2 \
libGLU.so.1 \
libTKBO.so.7.7 \
libTKBRep.so.7.7 \
libTKCDF.so.7.7 \
libTKIGES.so.7.7 \
libTKLCAF.so.7.7 \
libTKMath.so.7.7 \
libTKMesh.so.7.7 \
libTKPrim.so.7.7 \
libTKSTEP.so.7.7 \
libTKTopAlgo.so.7.7 \
libTKXCAF.so.7.7 \
libTKXDEIGES.so.7.7 \
libTKXDESTEP.so.7.7 \
libTKXSBase.so.7.7 \
libTKernel.so.7.7 \
libc.so.6 \
libcairo.so.2 \
libcurl.so.4 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libharfbuzz.so.0 \
libm.so.6 \
libngspice0 \
libodbc.so.2 \
libpixman-1.so.0 \
libpython3.10.so.1.0 \
libstdc++.so.6 \
libwx-baseu-net-suse.so.9.0.0 \
libwx-baseu-suse.so.9.0.0 \
libwx-baseu-xml-suse.so.9.0.0 \
libwx-gtk3u-aui-suse.so.9.0.0 \
libwx-gtk3u-core-suse.so.9.0.0 \
libwx-gtk3u-gl-suse.so.9.0.0 \
libwx-gtk3u-html-suse.so.9.0.0 \
libwx-gtk3u-propgrid-suse.so.9.0.0 \
libwx-gtk3u-stc-suse.so.9.0.0 \
libz.so.1 \
python-abi"

inherit rpm
