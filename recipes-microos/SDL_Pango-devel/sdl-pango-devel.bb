SUMMARY = "Headers for SDL_Pango development"
DESCRIPTION = "This package contains the necessary include files and libraries needed \
to develop applications that require SDL_Pango."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.2"

RPM_NAME = "SDL_Pango-devel-0.1.2-240.5.aarch64.rpm"
RPM_HASH = "a9173ceff464b598e42c58fdcb248017dcfb025a7a4519189a6a1bcff8e73a2f7b45e989cec79dd211b9a667bdf5619800ff5202db2bb5691b02353d9d5f9f65"

RPROVIDES:${PN} += "SDL_Pango-devel SDL_Pango-devel(aarch-64) libSDL_Pango-devel pkgconfig(SDL_Pango)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libSDL_Pango1 pkgconfig(pango) pkgconfig(sdl)"

inherit rpm
