SUMMARY = "Alternate files quickly"
DESCRIPTION = "Vim plugin to quickly switch between corresponding files. E.g. if you are \
editing foo.c and need to edit foo.h simply execute :A and you will be editing \
foo.h, to switch back to foo.c execute :A again. It has builtin support for C, \
C++ and ADA95 and can be configured to support a variety of languages."
LICENSE = "ISC"

PV = "2.18"

RPM_NAME = "vim-plugin-a-2.18-56.1.noarch.rpm"
RPM_HASH = "c391524e5830cf4e3e78cf666a1bd8ba98552a34f627d7a7cd17dbcd38009da993b5d5df54ef25d7b8135446efafa5388741b0b3bbe3446673a5c6a2cec37926"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-a"

RDEPENDS:${PN} += "vim"

inherit rpm
