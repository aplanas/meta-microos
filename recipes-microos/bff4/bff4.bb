SUMMARY = "Fast Brainfuck interpreter"
DESCRIPTION = "Optimizing brainfuck implementation of dialect based on Daniel's dbfi (see 'A very short self-interpreter') \
 \
This interpreter has only one input: program and input to the program have to be separated with ! e.g. ',.!a' prints 'a' To use it in interactive mode paste your program as input. \
 \
This program is compiled with optimization of linear loops (where '<>' balanced), e.g. [->+>++<<]. Linear loop is then executed in one step. \
 \
Oleg Mazonka 4.12.06  http://mazonka.com/"
LICENSE = "SUSE-Public-Domain"

PV = "1"

RPM_NAME = "bff4-1-14.26.aarch64.rpm"
RPM_HASH = "747d329c693f75921b72660d8a6465fecc71c884c5b59e27955f5fdd273bfe71ba93e16ac0d3876942a25758f17562d3b5d40427c844f73c6c5b2783e502a7a5"

RPROVIDES:${PN} += "bff4 \
bff4(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
