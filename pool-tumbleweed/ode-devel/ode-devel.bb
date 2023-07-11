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

RPM_NAME = "ode-devel-0.16.3-1.4.aarch64.rpm"
RPM_HASH = "e9a9e494e892b48576320e65080b0910f6a0890a168d23850f65125518eccdb64acf5526d12be349fe95e12aefd40dc4ec412e1c96a024f352e6a5eb4b8ce4b0"

RPROVIDES:${PN} += "libode-devel \
ode-devel \
pkgconfig-ode"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libode8"

inherit rpm
