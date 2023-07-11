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

RPM_NAME = "python311-pivy-0.6.8-1.5.aarch64.rpm"
RPM_HASH = "8697e4c61e47db1496832a9ff734ab5f2d6ed527644bbb8c7a532fc61896d3a56314133c232d6c3d72f9c383ee168c88c1e77a05ad5043026e7fe5b715b5da44"

RPROVIDES:${PN} += "python3-pivy \
python3.11dist-pivy \
python311-pivy \
python3dist-pivy"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
ld-linux-aarch64.so.1 \
libCoin.so.80 \
libSoQt.so.20 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
