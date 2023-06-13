SUMMARY = "Tool for compiling simutrans data packages"
DESCRIPTION = "Makeobj is a easy to use software used to compile .dat files and .png pictures \
to simutrans .pak files."
LICENSE = "Artistic-1.0"

PV = "123.0.1"

RPM_NAME = "simutrans-makeobj-123.0.1-1.9.aarch64.rpm"
RPM_HASH = "417ef666b58ee52d148f941851c06e0291498a24100dbdc4c17940a5c89bc1ed42bae32387f618efed7578562140413bd17e6e7ef49a823f9b83332bf00603bb"

RPROVIDES:${PN} += "simutrans-makeobj \
simutrans-makeobj(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
