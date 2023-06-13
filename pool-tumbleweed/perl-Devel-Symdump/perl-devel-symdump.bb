SUMMARY = "Dump Symbol Names or the Symbol Table"
DESCRIPTION = "This little package serves to access the symbol table of perl."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "2.18"

RPM_NAME = "perl-Devel-Symdump-2.18-1.23.noarch.rpm"
RPM_HASH = "244aa70f81aa9c7cbe49e2b224f2196b61e40716c8f2cfeffd99f043b6125e7f716c55c92f35ce525e8b8ff1c50b3ab7bb27aa2510a52596ca9fdc26b9af3d1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Devel::Symdump) \
perl(Devel::Symdump::Export) \
perl-Devel-Symdump"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Compress::Zlib)"

inherit rpm
