SUMMARY = "Check for memory leaks and circular memory references"
DESCRIPTION = "Check for memory leaks and circular memory references"
LICENSE = "Artistic-2.0"

PV = "1.06"

RPM_NAME = "perl-Test-Memory-Cycle-1.06-2.25.noarch.rpm"
RPM_HASH = "ca43348d7cc20bb0a146ad3927da1c87dd3f68aa27116fec0dea8c1bdbeccbf68cf8526dfb744f6df06c3d924f4f284282ca943f39ad29d85665d4e0447d3e0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::Memory::Cycle) \
perl-Test-Memory-Cycle"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Devel::Cycle) \
perl(PadWalker)"

inherit rpm
