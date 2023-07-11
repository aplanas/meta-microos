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

RPM_NAME = "python39-pivy-0.6.8-1.5.aarch64.rpm"
RPM_HASH = "695fee5d27f1e6d3439306e3e006013bb7057f277e910269b79cb75b7cc04be30210dd3f1fc2a6d2fcbf2623aae705c6311cc369c1279265ebd7f75be240d194"

RPROVIDES:${PN} += "python3.9dist-pivy \
python39-pivy \
python3dist-pivy"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
ld-linux-aarch64.so.1 \
libCoin.so.80 \
libSoQt.so.20 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
