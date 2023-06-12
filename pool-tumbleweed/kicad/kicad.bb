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

RPROVIDES:${PN} += "application() \
application(org.kicad.bitmap2component.desktop) \
application(org.kicad.eeschema.desktop) \
application(org.kicad.gerbview.desktop) \
application(org.kicad.kicad.desktop) \
application(org.kicad.pcbcalculator.desktop) \
application(org.kicad.pcbnew.desktop) \
kicad \
kicad(aarch-64) \
libkicad_3dsg.so.2.0.0()(64bit) \
libs3d_plugin_idf.so()(64bit) \
libs3d_plugin_oce.so()(64bit) \
libs3d_plugin_vrml.so()(64bit) \
metainfo() \
metainfo(org.kicad.kicad.metainfo.xml) \
mimehandler(application/x-excellon) \
mimehandler(application/x-gerber) \
mimehandler(application/x-gerber-job) \
mimehandler(application/x-kicad-pcb) \
mimehandler(application/x-kicad-project) \
mimehandler(application/x-kicad-schematic)"
RDEPENDS:${PN} += "/sbin/ldconfig \
kicad-footprints \
kicad-symbols \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGL.so.1()(64bit) \
libGLEW.so.2.2()(64bit) \
libGLU.so.1()(64bit) \
libTKBO.so.7.7()(64bit) \
libTKBRep.so.7.7()(64bit) \
libTKCDF.so.7.7()(64bit) \
libTKIGES.so.7.7()(64bit) \
libTKLCAF.so.7.7()(64bit) \
libTKMath.so.7.7()(64bit) \
libTKMesh.so.7.7()(64bit) \
libTKPrim.so.7.7()(64bit) \
libTKSTEP.so.7.7()(64bit) \
libTKTopAlgo.so.7.7()(64bit) \
libTKXCAF.so.7.7()(64bit) \
libTKXDEIGES.so.7.7()(64bit) \
libTKXDESTEP.so.7.7()(64bit) \
libTKXSBase.so.7.7()(64bit) \
libTKernel.so.7.7()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libcurl.so.4()(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgcc_s.so.1(GCC_4.5.0)(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libharfbuzz.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libngspice0 \
libodbc.so.2()(64bit) \
libpixman-1.so.0()(64bit) \
libpython3.10.so.1.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.11)(64bit) \
libstdc++.so.6(CXXABI_1.3.13)(64bit) \
libstdc++.so.6(CXXABI_1.3.2)(64bit) \
libstdc++.so.6(CXXABI_1.3.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.7)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.17)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.30)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.5)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libwx_baseu-suse.so.9.0.0()(64bit) \
libwx_baseu-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_baseu_net-suse.so.9.0.0()(64bit) \
libwx_baseu_net-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_baseu_xml-suse.so.9.0.0()(64bit) \
libwx_baseu_xml-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_aui-suse.so.9.0.0()(64bit) \
libwx_gtk3u_aui-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_core-suse.so.9.0.0()(64bit) \
libwx_gtk3u_core-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_gl-suse.so.9.0.0()(64bit) \
libwx_gtk3u_gl-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_html-suse.so.9.0.0()(64bit) \
libwx_gtk3u_html-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_propgrid-suse.so.9.0.0()(64bit) \
libwx_gtk3u_propgrid-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_stc-suse.so.9.0.0()(64bit) \
libwx_gtk3u_stc-suse.so.9.0.0(WXU_3.2)(64bit) \
libz.so.1()(64bit) \
python(abi)"

inherit rpm
