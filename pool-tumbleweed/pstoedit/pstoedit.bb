SUMMARY = "PostScript and PDF Converter"
DESCRIPTION = "pstoedit converts PostScript and PDF files to other vector graphic \
formats so that they can be edited graphically. \
 \
pstoedit supports: \
 \
* Tgif .obj format (for tgif version >= 3) \
* .fig format for xfig \
* pdf - Adobe's Portable Document Format \
* gnuplot format \
* Flattened PostScript (with or without Bezier curves) \
* DXF - CAD exchange format \
* LWO - LightWave 3D \
* RIB - RenderMan \
* RPL - Real3D \
* Java 1 or Java 2 applet \
* Idraw format (in fact a special form of EPS that idraw can read) \
* Tcl/Tk \
* HPGL \
* AI (Adobe Illustrator) (based on ps2ai.ps - not a real pstoedit driver - see notes below and manual) \
* Windows Meta Files (WMF) (Windows only) \
* Enhanced Windows Meta Files (EMF) (Windows, but also Linux/Unix if libemf is available) \
* OS/2 meta files (OS/2 only) \
* PIC format for troff/groff \
* MetaPost format for usage with TeX/LaTeX \
* LaTeX2e picture \
* Kontour \
* GNU Metafile (plotutils / libplot) \
* Skencil ( http://www.skencil.org ) \
* Mathematica \
* via ImageMagick to any format supported by ImageMagick \
* SWF \
* CNC G code \
* VTK files for ParaView and similar visualization tools"
LICENSE = "GPL-2.0-or-later"

PV = "3.78"

RPM_NAME = "pstoedit-3.78-2.5.aarch64.rpm"
RPM_HASH = "df073909d82dd0776f9a9aac14c402c9918e6b98a4c2034af08d75e6ce5ca7d79b540a49a25bbe99df6ebf9205a5c9a82d0dadc270d0887ebb6981d504e067d3"

RPROVIDES:${PN} += "libp2edrvlplot.so()(64bit) \
libp2edrvpptx.so()(64bit) \
libp2edrvstd.so()(64bit) \
libp2edrvwmf.so()(64bit) \
libpstoedit.so.0()(64bit) \
pstoedit \
pstoedit(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ghostscript \
ld-linux-aarch64.so.1()(64bit) \
libEMF.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libplotter.so.2()(64bit) \
libstdc++.so.6()(64bit) \
libzip.so.5()(64bit)"

inherit rpm
