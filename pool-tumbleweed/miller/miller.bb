SUMMARY = "Name-indexed data processing tool"
DESCRIPTION = "Miller (mlr) allows name-indexed data such as CSV and JSON files to be \
processed with functions equivalent to sed, awk, cut, join, sort etc. It can \
convert between formats, preserves headers when sorting or reversing, and \
streams data where possible so its memory requirements stay small. It works \
well with pipes and can feed 'tail -f'."
LICENSE = "BSD-2-Clause & BSD-4-Clause"

PV = "6.8.0+git20230604.4050f566"

RPM_NAME = "miller-6.8.0+git20230604.4050f566-1.1.aarch64.rpm"
RPM_HASH = "0391b6b9e219c84d901662f47dace5b29a0d6317520526bd52cd18d4acdfb32d45718b9bf6ab2584e904d5d17a6b495504dd4a5cc464ddd8c920f2fb955da204"

RPROVIDES:${PN} += "miller"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
