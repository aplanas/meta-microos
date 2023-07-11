SUMMARY = "Python wrapper for Google's RE2"
DESCRIPTION = "Python wrapper for Google's RE2"
LICENSE = "BSD-3-Clause"

PV = "1.0.7"

RPM_NAME = "python311-fb-re2-1.0.7-2.15.aarch64.rpm"
RPM_HASH = "d27343f6d4bfcb47c864b6b879e509258f5281e94359161bfd8a5dba846d64aaeda1cad5173535417248043a67ddf2a49cb43af29e47e8d67104a99189354008"

RPROVIDES:${PN} += "python3-fb-re2 \
python3.11dist-fb-re2 \
python311-fb-re2 \
python3dist-fb-re2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libre2.so.10 \
libstdc++.so.6 \
python-abi"

inherit rpm
