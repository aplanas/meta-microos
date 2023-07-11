SUMMARY = "Open Dynamics Engine Library development files"
DESCRIPTION = "ODE is an open source, high performance library for simulating rigid \
body dynamics. It is fully featured, stable, mature and platform \
independent with an easy to use C/C++ API. It has advanced joint types \
and integrated collision detection with friction. ODE is useful for \
simulating vehicles, objects in virtual reality environments and \
virtual creatures. It is currently used in many computer games, 3D \
authoring tools and simulation tools."
LICENSE = "BSD-3-Clause | LGPL-2.1-or-later"

PV = "0.16.3"

RPM_NAME = "libode8-0.16.3-1.4.aarch64.rpm"
RPM_HASH = "0a0d84de62076daa11bd5b5158e9442ae6d83ba6b039865d19489290194e2e9a1e2c7fe34d0f72651fd6b789e885279430b1468c3c6ee76d1ffccb2a3600028a"

RPROVIDES:${PN} += "libode.so.8 \
libode8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
