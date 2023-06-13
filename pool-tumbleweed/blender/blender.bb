SUMMARY = "A 3D Modelling And Rendering Package"
DESCRIPTION = "Blender is a 3D modelling and rendering package. It is the in-house \
software of a high quality animation studio, Blender has proven to \
be an extremely fast and versatile design instrument. The software \
has a personal touch, offering a unique approach to the world of \
Three Dimensions. Use Blender to create TV commercials, to make \
technical visualizations, business graphics, to do some morphing, \
or design user interfaces. You can easy build and manage complex \
environments. The renderer is versatile and extremely fast. All \
basic animation principles (curves & keys) are well implemented.It \
includes tools for modeling, sculpting, texturing (painting, \
node-based shader materials, or UV mapped), UV mapping, rigging and \
constraints, weight painting, particle systems, simulation (fluids, \
physics, and soft body dynamics and an external crowd simulator), \
rendering, node-based compositing, and non linear video editing, \
as well as an integrated game engine for real-time interactive 3D \
and game creation and playback with cross-platform compatibility."
LICENSE = "GPL-2.0-or-later"

PV = "3.5.0"

RPM_NAME = "blender-3.5.0-1.2.aarch64.rpm"
RPM_HASH = "c6143e5105e557a8fb8d1c15a07b3b0cbbc2cb8c4f8a7f69710bc1dca5b58ffd5b1ef27212246986f83211c187d0ccf238bb6247fbd9165a9c17c2e7a991d7ae"

RPROVIDES:${PN} += "application() \
application(blender.desktop) \
blender \
blender(aarch-64) \
blender-35 \
metainfo() \
metainfo(blender.appdata.xml) \
mimehandler(application/x-blender)"

RDEPENDS:${PN} += "/bin/bash \
/usr/bin/python3 \
/usr/bin/python3.10 \
audaspace-deviceplugin \
audaspace-fileplugin \
hicolor-icon-theme \
ld-linux-aarch64.so.1()(64bit) \
libAlembic.so.1.8()(64bit) \
libGeneratedSaxParser.so.0.3()(64bit) \
libIex-3_1.so.30()(64bit) \
libIlmThread-3_1.so.30()(64bit) \
libImath-3_1.so.29()(64bit) \
libLLVM.so.16()(64bit) \
libMathMLSolver.so.0.3()(64bit) \
libOpenCOLLADABaseUtils.so.0.3()(64bit) \
libOpenCOLLADAFramework.so.0.3()(64bit) \
libOpenCOLLADASaxFrameworkLoader.so.0.3()(64bit) \
libOpenCOLLADAStreamWriter.so.0.3()(64bit) \
libOpenColorIO.so.2.1()(64bit) \
libOpenEXR-3_1.so.30()(64bit) \
libOpenEXRCore-3_1.so.30()(64bit) \
libOpenImageIO.so.2.4()(64bit) \
libOpenImageIO_Util.so.2.4()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libUTF.so.0.3()(64bit) \
libX11.so.6()(64bit) \
libXfixes.so.3()(64bit) \
libXi.so.6()(64bit) \
libXrender.so.1()(64bit) \
libXxf86vm.so.1()(64bit) \
libatomic.so.1()(64bit) \
libaudaspace-c.so.1.4()(64bit) \
libaudaspace-py.so.1.4()(64bit) \
libavcodec.so.59()(64bit) \
libavdevice.so.59()(64bit) \
libavfilter.so.8()(64bit) \
libavformat.so.59()(64bit) \
libavutil.so.57()(64bit) \
libboost_atomic.so.1.82.0()(64bit) \
libboost_chrono.so.1.82.0()(64bit) \
libboost_date_time.so.1.82.0()(64bit) \
libboost_filesystem.so.1.82.0()(64bit) \
libboost_iostreams.so.1.82.0()(64bit) \
libboost_locale.so.1.82.0()(64bit) \
libboost_regex.so.1.82.0()(64bit) \
libboost_system.so.1.82.0()(64bit) \
libboost_thread.so.1.82.0()(64bit) \
libboost_wave.so.1.82.0()(64bit) \
libbuffer.so.0.3()(64bit) \
libc.so.6()(64bit) \
libepoxy.so.0()(64bit) \
libfftw3.so.3()(64bit) \
libfreetype.so.6()(64bit) \
libftoa.so.0.3()(64bit) \
libgcc_s.so.1()(64bit) \
libgmp.so.10()(64bit) \
libgmpxx.so.4()(64bit) \
libgomp.so.1()(64bit) \
libhpdf.so()(64bit) \
libjemalloc.so.2()(64bit) \
libjpeg.so.8()(64bit) \
liblzo2.so.2()(64bit) \
libm.so.6()(64bit) \
libopenjp2.so.7()(64bit) \
libopenpgl.so.0()(64bit) \
libopenvdb.so.9.0()(64bit) \
libosdCPU.so.3.4.4()(64bit) \
libosdGPU.so.3.4.4()(64bit) \
liboslcomp.so.1.12()(64bit) \
liboslexec.so.1.12()(64bit) \
liboslnoise.so.1.12()(64bit) \
liboslquery.so.1.12()(64bit) \
libpcre.so.1()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libpotrace.so.0()(64bit) \
libpugixml.so.1()(64bit) \
libpython3.10.so.1.0()(64bit) \
libspnav.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libswresample.so.4.ff5()(64bit) \
libswscale.so.6()(64bit) \
libtbb.so.12()(64bit) \
libtiff.so.6()(64bit) \
libxkbcommon.so.0()(64bit) \
libxml2.so.2()(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit) \
python310-base \
python310-numpy \
python310-requests"

inherit rpm
