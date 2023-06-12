SUMMARY = "LADSPA matched plugin"
DESCRIPTION = "This package provides LADSPA (Linux Audio Developer's Simple Plug-in API) \
plugins for emulating certain aspects of the tone of a real musical \
instrument amplifier, in real time.  It contains two plugins, matched and \
unmatched."
LICENSE = "GPL-2.0+"

PV = "1"

RPM_NAME = "ladspa-matched-1-4.24.aarch64.rpm"
RPM_HASH = "66f8484fd525b31fbefa00246323eca0632b1569e1337fc1c53c72cbdd6b183a798279c8204eb3fac00d630971233888274086f83d6d52364560ad179ff37e51"

RPROVIDES:${PN} += "ladspa-matched \
ladspa-matched(aarch-64) \
ladspa-unmatched"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
