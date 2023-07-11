SUMMARY = "LADSPA blop plugins"
DESCRIPTION = "This package provides a LADSPA (Linux Audio Developer's Simple Plug-in API) \
plugins to implement bandlimited sawtooth, square, variable pulse and \
slope-variable triangle waves."
LICENSE = "GPL-2.0+"

PV = "0.2.8"

RPM_NAME = "ladspa-blop-0.2.8-4.27.aarch64.rpm"
RPM_HASH = "a0b3645dacac7f1e1af17701c88187665db4872d7090e3f3010288beefa6eb8ab9c98e94169e821742edcc1e91822a2dacd698bbbb5f753e39872a73698d7043"

RPROVIDES:${PN} += "ladspa-blop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
