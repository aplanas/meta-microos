SUMMARY = "Alice Font"
DESCRIPTION = "Ksenia Erulevich, designer of the Alice typeface, was inspired by Lewis \
Carrol’s novel and decided to make a typeface that will be suitable for \
typesetting that book. \
 \
It came out eclectic and quaint, old-fashioned, having widened \
proportions, open aperture, and soft rounded features; perfect for long \
meditative text-setting and headlines."
LICENSE = "OFL-1.1"

PV = "2.003"

RPM_NAME = "cyreal-alice-fonts-2.003-1.1.noarch.rpm"
RPM_HASH = "d010b239aac6164fa39649b422d82f76422b08bbea0f7c5502a3b9fa845a67857cda67b40deb0cd9770ee893978c520f00fd4fb2df0e05cd5d51921e6d51f7bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cyreal-alice-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
