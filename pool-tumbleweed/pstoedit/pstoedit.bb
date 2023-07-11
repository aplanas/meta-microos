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

PV = "4.00"

RPM_NAME = "pstoedit-4.00-1.1.aarch64.rpm"
RPM_HASH = "3153810c26d6cf828b14dce48a1a874aa204473c76f7174c4ac89ca5f14b0a71795a75b41b61e174850df6639d8b4c48d1b5aa80e2a07051ba2afdd782df7d84"

RPROVIDES:${PN} += "libp2edrvlplot.so \
libp2edrvpptx.so \
libp2edrvstd.so \
libp2edrvwmf.so \
libpstoedit.so.0 \
pstoedit"

RDEPENDS:${PN} += "/sbin/ldconfig \
ghostscript \
ld-linux-aarch64.so.1 \
libEMF.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libplotter.so.2 \
libstdc++.so.6 \
libzip.so.5"

inherit rpm
