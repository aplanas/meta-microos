SUMMARY = "LADSPA blop plugins"
DESCRIPTION = "This package provides a LADSPA (Linux Audio Developer's Simple Plug-in API) \
plugins to implement bandlimited sawtooth, square, variable pulse and \
slope-variable triangle waves."
LICENSE = "GPL-2.0+"

PV = "0.2.8"

RPM_NAME = "ladspa-blop-0.2.8-4.26.aarch64.rpm"
RPM_HASH = "401f8b7d80a1c6d0f020d294ab7d719cb9c62cb118066058397862c611094b83d91c9882c0b9c5474125198e759b0f2169cb450170399f9c6458f4a23ffd69d6"

RPROVIDES:${PN} += "ladspa-blop \
ladspa-blop(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
