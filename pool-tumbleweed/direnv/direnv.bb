SUMMARY = "Environment switcher for shells"
DESCRIPTION = "direnv knows how to hook into bash, zsh, tcsh and fish shell to load \
or unload environment variables depending on the current directory. \
This allows to have project-specific environment variables and not \
clutter the '~/.profile' file."
LICENSE = "MIT"

PV = "2.32.2"

RPM_NAME = "direnv-2.32.2-1.4.aarch64.rpm"
RPM_HASH = "21b138c79e2782c4c6f07489691accb98012f696751a297c7077221ffab5d565f9b03286039a1c6536fe1c809d5617abe86753a806debb16e74367a12165cbd2"

RPROVIDES:${PN} += "direnv \
direnv(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
