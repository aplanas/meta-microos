SUMMARY = "Coin Binding for Python"
DESCRIPTION = "Pivy is a Coin binding for Python. Coin is a high-level 3D graphics library \
with a C++ Application Programming Interface. Coin uses scene-graph data \
structures to render real-time graphics suitable for mostly all kinds of \
scientific and engineering visualization applications. \
 \
Pivy allows: \
 \
- Development of Coin applications and extensions in Python \
- Interactive modification of Coin programs from within the Python interpreter \
  at runtime \
- Incorporation of Scripting Nodes into the scene graph which are capable of \
  executing Python code and callbacks"
LICENSE = "GPL-2.0-only & ISC"

PV = "0.6.8"

RPM_NAME = "python310-pivy-0.6.8-1.4.aarch64.rpm"
RPM_HASH = "6669dabe4374d4c214cf29b182dc0cae20c61188883982480fc61a028c8735711c34b59004620e3fd83bb6806c3d647e283c53aab915fe66ddaf31bf37895f45"

RPROVIDES:${PN} += "python3-pivy \
python3.10dist(pivy) \
python310-pivy \
python310-pivy(aarch-64) \
python3dist(pivy)"
RDEPENDS:${PN} += "/usr/bin/python3.10 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libCoin.so.80()(64bit) \
libSoQt.so.20()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
python(abi)"

inherit rpm