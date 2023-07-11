SUMMARY = "FireWire 1394 support for audio devices, svn snapshot"
DESCRIPTION = "FFADO aims to provide a generic, open-source solution \
to support FireWire(IEEE1394, iLink) based (semi-) \
professional audio interfaces. \
It's the successor of the FreeBoB project. FFADO is a \
volunteer-based community effort, trying to provide Linux \
with at least the same level of functionality that is \
present on the other operating systems. \
The range of FireWire Audio Devices that we would like \
to support is broad: from pure audio interfaces over \
mixed audio-control devices to DSP algorithm devices. \
This is a snapshot of svn revision 2040"
LICENSE = "GPL-2.0-or-later"

PV = "2.4.7"

RPM_NAME = "ffado-mixer-2.4.7-1.1.noarch.rpm"
RPM_HASH = "a44cf5625201403504e3992fdb6380c260f2a750a59ff54376c3bfc11d3379fa319957ea1e6828a6ecfab6c88bf2b83603cf998a46bbe08a09caa5556060a9b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ffado-mixer"

RDEPENDS:${PN} += "/usr/bin/python3 \
ffado \
python-abi"

inherit rpm
