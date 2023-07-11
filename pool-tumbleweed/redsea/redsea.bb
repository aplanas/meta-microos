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

RPM_NAME = "redsea-0.20-1.10.aarch64.rpm"
RPM_HASH = "73f09cdcde007360f758c4156ba40372375019342654df6b4701488e1f09023a279e796c533bc11b47d7ebba9fcd296c8da4f6159416aa98cf08591ad4ec7308"

RPROVIDES:${PN} += "redsea"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libliquid.so \
libsndfile.so.1 \
libstdc++.so.6"

inherit rpm
