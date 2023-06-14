SUMMARY = "Module to define equality, equivalence and inspection methods"
DESCRIPTION = "Module to define equality, equivalence and inspection methods."
LICENSE = "MIT"

PV = "0.0.11"

RPM_NAME = "ruby3.2-rubygem-equalizer-0.0.11-1.32.aarch64.rpm"
RPM_HASH = "04a3cab7173c31d1d2738848464a55d6061a42aa53aa19af19425bc6d832c999cf58d5d5c819ad18ecb54a4d335d7e04ad47bbb6064db20e9dee094fbbd33518"

RPROVIDES:${PN} += "ruby3.2-rubygem-equalizer \
rubygem-equalizer \
rubygem-ruby-3.2.0-equalizer \
rubygem-ruby-3.2.0-equalizer-0 \
rubygem-ruby-3.2.0-equalizer-0.0 \
rubygem-ruby-3.2.0-equalizer-0.0.11"

RDEPENDS:${PN} += "ruby-abi"

inherit rpm
