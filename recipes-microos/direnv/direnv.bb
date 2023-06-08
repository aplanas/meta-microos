SUMMARY = "Environment switcher for shells"
DESCRIPTION = "direnv knows how to hook into bash, zsh, tcsh and fish shell to load \
or unload environment variables depending on the current directory. \
This allows to have project-specific environment variables and not \
clutter the '~/.profile' file."
LICENSE = "MIT"

PV = "2.32.2"

RPM_NAME = "direnv-2.32.2-1.3.aarch64.rpm"
RPM_HASH = "988b9b47b8fa8ac7a2d25b685d4651b1778ace5dfe394cb8ee195ec90df1e3613dac90b39f11e31ad2a9880cff52040527fb9cbccd99690cb1cacd06ec6c5c46"

RPROVIDES:${PN} += "direnv direnv(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
