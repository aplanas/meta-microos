SUMMARY = "Tool to create a binary DAFSA from a Public Suffix List"
DESCRIPTION = "psl-make-dafsa converts ASCII string into C source or a binary format, \
The format used is DAFSA, deterministic acyclic finate state automaton. \
 \
libpsl is capable of using this compact binary form of the Public Suffix List (PSL). \
 \
This package is a build dependency for the publicsuffix package."
LICENSE = "BSD-3-Clause"

PV = "0.21.2"

RPM_NAME = "psl-make-dafsa-0.21.2-1.2.noarch.rpm"
RPM_HASH = "3cd6466ba4a01d537eaa4ec64099c058a3954e02099e65ef730f5186bbca5347d2f2c7b2bf75bba9da578e9f4bb18193713cc82b9b14404f0e09594aef7841e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "psl-make-dafsa"
RDEPENDS:${PN} += "/usr/bin/python3 \
python3-base"

inherit rpm
