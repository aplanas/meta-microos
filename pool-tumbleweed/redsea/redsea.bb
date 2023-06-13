SUMMARY = "An RDS decoder"
DESCRIPTION = "redsea is a command-line RDS (Radio Data System) decoder. \
It can be used with any RTL-SDR USB radio stick with the rtl_fm tool. \
It can also decode the raw ASCII bitstream, the hex format used by RDS Spy, \
and audio files containing multiplex signals (MPX). \
 \
RDS groups are printed to the terminal as line-delimited JSON objects \
or, optionally, undecoded hex blocks (-x)."
LICENSE = "MIT"

PV = "0.20"

RPM_NAME = "redsea-0.20-1.9.aarch64.rpm"
RPM_HASH = "a01937cced2952ffca73dc74051a381101235f60c05c8a33cd2dce6aae94ceb95b162388824f92d95a23ef57647366acec93d4442e7966421bbc357c0cf40853"

RPROVIDES:${PN} += "redsea \
redsea(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libliquid.so()(64bit) \
libsndfile.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
