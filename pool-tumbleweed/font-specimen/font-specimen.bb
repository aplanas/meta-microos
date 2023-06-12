SUMMARY = "Font Specimen Creator"
DESCRIPTION = "Creates specimen for given installed font and script it \
sufficiently coverages. Run font-specimen without \
parameters to see usage."
LICENSE = "GPL-2.0+"

PV = "20150202"

RPM_NAME = "font-specimen-20150202-3.17.aarch64.rpm"
RPM_HASH = "4328e1b6042e775b0a3cac7b450caf3545ad516541d1b4aabc805ad31361274344e9cceb2f152fb0467e66fa42cbe8c6bbc5cbcd795ec755d3ac90b9168e46b7"

RPROVIDES:${PN} += "font-specimen \
font-specimen(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfont-specimen.so.0()(64bit)"

inherit rpm
