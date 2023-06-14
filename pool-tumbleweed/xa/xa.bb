SUMMARY = "High-speed, two-pass portable 6502 cross-assembler"
DESCRIPTION = "xa is a high-speed, two-pass portable cross-assembler for the 6502 CPU \
with a C-like preprocessor. One of several popular 65xx assemblers, xa \
is written in C and released under the GPL-2. It has been in continuous \
development since 1989. \
 \
Other tools in the xa package are: \
 * file65   - a tool for printing information about o65 object files. \
 * ldo65    - a linker for o65 object files. \
 * printcbm - a simple CBM BASIC detokenizer similar to the far more \
              powerful petcat proviced by VICE. \
 * reloc65  - a relocator for o65 object files. \
 * uncpk    - a c64 cpk archive manager."
LICENSE = "GPL-2.0-or-later"

PV = "2.3.14"

RPM_NAME = "xa-2.3.14-1.2.aarch64.rpm"
RPM_HASH = "e473fcf72d7e228b86b8431e8acd4e080ce1fff36762b4e76c1cdb62a27f92dabbca38ba8a59732a3b5ce4dcf14a3fbc9b14dd8a8747e6ffd0345cf345fe348f"

RPROVIDES:${PN} += "xa"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
