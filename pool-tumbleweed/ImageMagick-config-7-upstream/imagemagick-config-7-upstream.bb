SUMMARY = "Upstream Configuration Files"
DESCRIPTION = "ImageMagick configuration as supplied by upstream. It does not \
provide any security restrictions. ImageMagick will be vulnerable \
for example by ImageTragick or PS/PDF coder issues. It should \
be used in trusted environment. Version or maintenance updates \
will not overwrite user changes in system configuration."
LICENSE = "ImageMagick"

PV = "7.1.1.12"

RPM_NAME = "ImageMagick-config-7-upstream-7.1.1.12-1.1.aarch64.rpm"
RPM_HASH = "581308712cd62d9736679c09537ef9cf05377fca307b563daf47ced4f36490cf74e0cc67a2b67963f560c10f151d8570f020198c651cf1989ce012d930920ddc"

RPROVIDES:${PN} += "ImageMagick-config-7-upstream \
config-ImageMagick-config-7-upstream \
imagick-config-7"

RDEPENDS:${PN} += "/usr/bin/sh \
update-alternatives"

inherit rpm
