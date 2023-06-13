SUMMARY = "Alternate files quickly"
DESCRIPTION = "Vim plugin to quickly switch between corresponding files. E.g. if you are \
editing foo.c and need to edit foo.h simply execute :A and you will be editing \
foo.h, to switch back to foo.c execute :A again. It has builtin support for C, \
C++ and ADA95 and can be configured to support a variety of languages."
LICENSE = "ISC"

PV = "2.18"

RPM_NAME = "vim-plugin-a-2.18-55.1.noarch.rpm"
RPM_HASH = "fa14e373b19ede9a66fcd036eb760efab39cdfb1a567ee3878eadd1e20f782eded9054bda71073f84ee831ca43df7e61a1d527e4667ef94387ee886451ded608"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-a"

RDEPENDS:${PN} += "vim"

inherit rpm
