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

RPM_NAME = "udunits2-2.2.28-1.9.aarch64.rpm"
RPM_HASH = "ce70b68f85ea6a6ce3c0302b33391d1fdd339fea4a4abf16924eb6e838f53f7699fe5f21b33db59247680094e514b46cac692adb867e66138f296de2555c6777"

RPROVIDES:${PN} += "udunits2"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libudunits2.so.0"

inherit rpm
