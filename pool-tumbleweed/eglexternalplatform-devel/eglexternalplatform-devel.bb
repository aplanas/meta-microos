SUMMARY = "The EGL External Platform interface"
DESCRIPTION = "This is a work-in-progress specification of the EGL External Platform interface \
for writing EGL platforms and their interactions with window systems on \
top of existing low-level EGL platform implementations. This keeps window system \
implementation specifics out of EGL drivers by using application-facing \
EGL functions."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "eglexternalplatform-devel-1.1-3.6.noarch.rpm"
RPM_HASH = "ed552d82c493695858d28b7eb2e8ec76fc8066140f9919e56fa3946807ca73237aeb5261e407e1eb5e6b4a5402bc7ac7164b3f26b5c30717abce7b65be0f9824"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eglexternalplatform-devel \
pkgconfig(eglexternalplatform)"
RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
