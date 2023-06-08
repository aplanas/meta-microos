SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "11.3.1+git2076"

RPM_NAME = "cross-mips-gcc11-icecream-backend-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "4921cb3f49e76eafe70145dd08b6580263e8719255bbbed885cde299a395e97180d00b60c13787b72edd50d5f01a5896da5043f01e1001df070492096a54034a"

RPROVIDES:${PN} += "cross-mips-gcc11-icecream-backend cross-mips-gcc11-icecream-backend(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
