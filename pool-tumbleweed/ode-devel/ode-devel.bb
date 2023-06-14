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

RPM_NAME = "ode-devel-0.16.3-1.3.aarch64.rpm"
RPM_HASH = "d29dd135a66e152099f7dc5df2200a0e1ab6469d0a189c94f0b73873bda9f423e7d6e18d09f555f73f5b5c54d00725a67f39bfbdcb2e42db6b016c502fdeea98"

RPROVIDES:${PN} += "libode-devel \
ode-devel \
pkgconfig-ode"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
libode8"

inherit rpm
