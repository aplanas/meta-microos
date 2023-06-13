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

PV = "2.4.3"

RPM_NAME = "ffado-mixer-2.4.3-3.1.noarch.rpm"
RPM_HASH = "e8cbfdd0ebc1f1e9eb1e1f59dd1d4d74298712142f973a867150c47aea8fbfaa85529a26695b2a0d47eac038054cdc3e0f3a6d338c8adc7dc2ded6a456dd6bdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(ffadomixer.desktop) \
ffado-mixer \
metainfo() \
metainfo(ffado-mixer.appdata.xml)"

RDEPENDS:${PN} += "/usr/bin/python3 \
ffado \
python(abi)"

inherit rpm
