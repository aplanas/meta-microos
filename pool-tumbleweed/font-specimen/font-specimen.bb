SUMMARY = "Font Specimen Creator"
DESCRIPTION = "Creates specimen for given installed font and script it \
sufficiently coverages. Run font-specimen without \
parameters to see usage."
LICENSE = "GPL-2.0+"

PV = "20150202"

RPM_NAME = "font-specimen-20150202-3.18.aarch64.rpm"
RPM_HASH = "434108b91e5b35aa4971fbdd55be77aa62a28064e4c25dee7f3d32e37833bb4fe475cf35b86cf3b55b49e2496c022bb85bb2865af27321957e298b5305f10ca5"

RPROVIDES:${PN} += "font-specimen"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfont-specimen.so.0"

inherit rpm
