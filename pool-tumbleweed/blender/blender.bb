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

PV = "3.5.1"

RPM_NAME = "blender-3.5.1-1.2.aarch64.rpm"
RPM_HASH = "80cca907ba7587947de2a22d8ff336057e43aee5e32e0a3fa5aef378dbf4d8405a7c7ce1612d29d414035c11d29dabd5e6cabcf61ccbe9b48f48d579ef4b5ead"

RPROVIDES:${PN} += "blender \
blender-35"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/python3.10 \
audaspace-deviceplugin \
audaspace-fileplugin \
hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libAlembic.so.1.8 \
libGeneratedSaxParser.so.0.3 \
libIex-3-1.so.30 \
libIlmThread-3-1.so.30 \
libImath-3-1.so.29 \
libLLVM.so.16 \
libMathMLSolver.so.0.3 \
libOpenCOLLADABaseUtils.so.0.3 \
libOpenCOLLADAFramework.so.0.3 \
libOpenCOLLADASaxFrameworkLoader.so.0.3 \
libOpenCOLLADAStreamWriter.so.0.3 \
libOpenColorIO.so.2.1 \
libOpenEXR-3-1.so.30 \
libOpenEXRCore-3-1.so.30 \
libOpenImageIO-Util.so.2.4 \
libOpenImageIO.so.2.4 \
libSDL2-2.0.so.0 \
libUTF.so.0.3 \
libX11.so.6 \
libXfixes.so.3 \
libXi.so.6 \
libXrender.so.1 \
libXxf86vm.so.1 \
libatomic.so.1 \
libaudaspace-c.so.1.4 \
libaudaspace-py.so.1.4 \
libavcodec.so.60 \
libavdevice.so.60 \
libavfilter.so.9 \
libavformat.so.60 \
libavutil.so.58 \
libboost-atomic.so.1.82.0 \
libboost-chrono.so.1.82.0 \
libboost-date-time.so.1.82.0 \
libboost-filesystem.so.1.82.0 \
libboost-iostreams.so.1.82.0 \
libboost-locale.so.1.82.0 \
libboost-regex.so.1.82.0 \
libboost-system.so.1.82.0 \
libboost-thread.so.1.82.0 \
libboost-wave.so.1.82.0 \
libbuffer.so.0.3 \
libc.so.6 \
libepoxy.so.0 \
libfftw3.so.3 \
libfreetype.so.6 \
libftoa.so.0.3 \
libgcc-s.so.1 \
libgmp.so.10 \
libgmpxx.so.4 \
libgomp.so.1 \
libhpdf.so.2 \
libjemalloc.so.2 \
libjpeg.so.8 \
liblzo2.so.2 \
libm.so.6 \
libopenjp2.so.7 \
libopenpgl.so.0 \
libopenvdb.so.9.0 \
libosdCPU.so.3.4.4 \
libosdGPU.so.3.4.4 \
liboslcomp.so.1.12 \
liboslexec.so.1.12 \
liboslnoise.so.1.12 \
liboslquery.so.1.12 \
libpcre.so.1 \
libpng16.so.16 \
libpotrace.so.0 \
libpugixml.so.1 \
libpython3.10.so.1.0 \
libspnav.so.0 \
libstdc++.so.6 \
libswresample.so.4 \
libswscale.so.7 \
libtbb.so.12 \
libtiff.so.6 \
libxkbcommon.so.0 \
libxml2.so.2 \
libz.so.1 \
libzstd.so.1 \
python310-base \
python310-numpy \
python310-requests"

inherit rpm
