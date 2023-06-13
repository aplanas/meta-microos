SUMMARY = "A library for manipulating units of physical quantities"
DESCRIPTION = "The Unidata units utility, udunits, supports conversion of unit specifications \
between formatted and binary forms, arithmetic manipulation of unit \
specifications, and conversion of values between compatible scales of \
measurement. A unit is the amount by which a physical quantity is measured. For \
example: \
 \
                  Physical Quantity   Possible Unit \
                  _________________   _____________ \
                        time              weeks \
                      distance         centimeters \
                        power             watts \
 \
This utility works interactively and has two modes. In one mode, both an input \
and output unit specification are given, causing the utility to print the \
conversion between them. In the other mode, only an input unit specification is \
given. This causes the utility to print the definition -- in standard units -- \
of the input unit."
LICENSE = "MIT"

PV = "2.2.28"

RPM_NAME = "udunits2-2.2.28-1.8.aarch64.rpm"
RPM_HASH = "bd8167c91963bec7bbaa4ff85f4f07df0435c8eda8fad678723f778991739e2a689cfb07d9d23b3efdf7602bc3cf3cc4f36092cfa318884bf53a718595811f59"

RPROVIDES:${PN} += "udunits2 \
udunits2(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libudunits2.so.0()(64bit)"

inherit rpm
