SUMMARY = "Tools to access Microsoft executable (EXE) format files"
DESCRIPTION = "Tools to access Microsoft executable (.exe) format files \
including PE/COFF formats."
LICENSE = "LGPL-3.0-or-later"

PV = "20210424"

RPM_NAME = "libexe-tools-20210424-5.1.aarch64.rpm"
RPM_HASH = "dbecfeec919e6dbc6af6c4e9fd0f12a335d5a35416bbf132a0bc1264bfd594e6874e2466eb7a07fa8c9249ccd4dc69ab67173dfe47773e4106f5eacfb31da06a"

RPROVIDES:${PN} += "libexe-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libexe.so.1"

inherit rpm
