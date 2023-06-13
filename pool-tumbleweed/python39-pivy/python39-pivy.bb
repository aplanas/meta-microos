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

RPM_NAME = "python39-pivy-0.6.8-1.4.aarch64.rpm"
RPM_HASH = "f92ab164f228545bfd28828a0add7c59c1c415dbecd5e61d653fecfd156e86022b44fa155fd7c817676565c46ea7494a2e069337874f4b8cc75d2fb76d87cad2"

RPROVIDES:${PN} += "python3.9dist(pivy) \
python39-pivy \
python39-pivy(aarch-64) \
python3dist(pivy)"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
ld-linux-aarch64.so.1()(64bit) \
libCoin.so.80()(64bit) \
libSoQt.so.20()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
python(abi)"

inherit rpm
