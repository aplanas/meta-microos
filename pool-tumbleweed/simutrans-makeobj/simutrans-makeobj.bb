SUMMARY = "Tool for compiling simutrans data packages"
DESCRIPTION = "Makeobj is a easy to use software used to compile .dat files and .png pictures \
to simutrans .pak files."
LICENSE = "Artistic-1.0"

PV = "123.0.1"

RPM_NAME = "simutrans-makeobj-123.0.1-1.10.aarch64.rpm"
RPM_HASH = "d4944d346fc4cda8efcc3318f87a25db86b538528d9d7a709959f34699ca97bfddf396360180e25d801fb995f1663560a59e9380bf0e616d4a45947f404a915b"

RPROVIDES:${PN} += "simutrans-makeobj"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libpng16.so.16 \
libstdc++.so.6"

inherit rpm
