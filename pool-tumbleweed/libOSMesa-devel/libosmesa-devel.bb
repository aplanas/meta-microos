SUMMARY = "Development files for the Mesa Offscreen Rendering extension"
DESCRIPTION = "Development files for the OSmesa Mesa extension that allows programs to render to an \
off-screen buffer using the OpenGL API without having to create a \
rendering context on an X Server. It uses a pure software renderer."
LICENSE = "MIT"

PV = "23.0.3"

RPM_NAME = "libOSMesa-devel-23.0.3-349.1.aarch64.rpm"
RPM_HASH = "1e3e8b64baa19ebad2c5e459fc34f9720f51197aa4efe6220574debd11cd254a5970ee752fb9b29967048e366859cf45b0273a069dc65cb00ca8679d742f7b43"

RPROVIDES:${PN} += "libOSMesa-devel \
libOSMesa-devel(aarch-64) \
pkgconfig(osmesa)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOSMesa8"

inherit rpm
