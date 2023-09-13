SUMMARY = "Python Utility and Demonstration Scripts"
DESCRIPTION = "A number of scripts that are useful for building, testing or extending Python, \
and a set of demonstration programs."
LICENSE = "Python-2.0"

PV = "3.8.18"

RPM_NAME = "python38-tools-3.8.18-1.1.aarch64.rpm"
RPM_HASH = "737705b1008ddf67223bfaae7d5780ffaab0225e27490bcd183064b7d6b9ab550f101bf04ccbee72866dcb6580e65184c5795dcb03f4d79299f3256d4d0a8c23"

RPROVIDES:${PN} += "python38-2to3 \
python38-demo \
python38-tools"

RDEPENDS:${PN} += "/usr/bin/python3.8 \
python-abi \
python38-base"

inherit rpm
