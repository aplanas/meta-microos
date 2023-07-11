SUMMARY = "A test case generator for robustness testing, aka a fuzzer"
DESCRIPTION = "Radamsa is a test case generator for robustness testing, aka a fuzzer. It \
can be used to test how well a program can stand malformed and potentially \
malicious inputs. It operates based on given sample inputs and thus \
requires minimal effort to set up. The main selling points of radamsa are \
that it is easy to use, contains several old and new fuzzing algorithms, is \
easy to script from command line and has already been used to find a slew \
of bugs in programs that actually matter."
LICENSE = "MIT"

PV = "0.6"

RPM_NAME = "radamsa-0.6-2.1.aarch64.rpm"
RPM_HASH = "7d364c001f9b498e07c55508e0949dc4e8a48c3bc60365094001976e898c2b0c3d271111b454b2ec96840b8e547227fa3aed86f19c2f519f2359128d88246856"

RPROVIDES:${PN} += "radamsa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
