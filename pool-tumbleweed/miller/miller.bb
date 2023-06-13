SUMMARY = "Name-indexed data processing tool"
DESCRIPTION = "Miller (mlr) allows name-indexed data such as CSV and JSON files to be \
processed with functions equivalent to sed, awk, cut, join, sort etc. It can \
convert between formats, preserves headers when sorting or reversing, and \
streams data where possible so its memory requirements stay small. It works \
well with pipes and can feed 'tail -f'."
LICENSE = "BSD-2-Clause & BSD-4-Clause"

PV = "6.7.0+git20230328.dc14420f"

RPM_NAME = "miller-6.7.0+git20230328.dc14420f-1.2.aarch64.rpm"
RPM_HASH = "d4186e459b433e8d2c2cf8fe1de43cdfe5ee724fa647c7a89a5c4c54488da6e1ba8f4c71689faf053a311be0d11c74a80dc68b58d09a021f4bafc10f74bf09ee"

RPROVIDES:${PN} += "miller \
miller(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
