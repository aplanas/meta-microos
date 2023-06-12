SUMMARY = "X11 Front-End for BibTeX Databases"
DESCRIPTION = "Using bibview, entries in several BiB databases can be moved, \
manipulated, created, and searched."
LICENSE = "SUSE-Permissive"

PV = "2.2"

RPM_NAME = "bibview-2.2-1008.16.aarch64.rpm"
RPM_HASH = "e6c6fa7056d849b7bc1e7ad9c4b626380d0ffa32ca509949cb9a598b69f978d6a012925997fc8894d8700b436f1ec2259bd0e0b77a9fe8f9c2074ea51d1cf438"

RPROVIDES:${PN} += "bibview \
bibview(aarch-64) \
bibvw15 \
config(bibview)"
RDEPENDS:${PN} += "libX11.so.6()(64bit) \
libXaw3d.so.8()(64bit) \
libXt.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
