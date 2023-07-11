SUMMARY = "Devel files for minisat"
DESCRIPTION = "Headers and libraries for the minisat package."
LICENSE = "MIT"

PV = "2.2.1+20200902"

RPM_NAME = "minisat-devel-2.2.1+20200902-3.5.aarch64.rpm"
RPM_HASH = "a22e437d88502c89e25668f716b8c67a02b9bc374cadf8b22eaa1d22cb173f19087052ceaa60e7d34b130c4eb09debbe40d9c6a15dbea426f5a99c6cf98a49d2"

RPROVIDES:${PN} += "cmake-minisat \
minisat-devel"

RDEPENDS:${PN} += "libminisat2 \
zlib-devel"

inherit rpm
