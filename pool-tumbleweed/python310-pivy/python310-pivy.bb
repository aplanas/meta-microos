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

RPM_NAME = "python310-pivy-0.6.8-1.5.aarch64.rpm"
RPM_HASH = "c1acd8517cfd4d04dedafca590eb1cefe0f14492da6ccb50e32b01c1da76b2c8ebe385c84d6d0e2c7b19c9d163388569458f092b5b7293d902a133524c29a13e"

RPROVIDES:${PN} += "python3.10dist-pivy \
python310-pivy \
python3dist-pivy"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
ld-linux-aarch64.so.1 \
libCoin.so.80 \
libSoQt.so.20 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
