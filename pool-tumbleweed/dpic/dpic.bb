SUMMARY = "Pic language processor"
DESCRIPTION = "Pic language processor for LaTeX documents or web sites."
LICENSE = "BSD-2-Clause & CC-BY-3.0"

PV = "2023.02.01"

RPM_NAME = "dpic-2023.02.01-2.1.aarch64.rpm"
RPM_HASH = "6fb3961dd157b88539a96ae7ecf03512b9da972d4b13358ad1ae496f3afee18cdf8eec9e6d5541c4cb70e80a589419fe71fcfe2293541fcafc390ad0cbea58b9"

RPROVIDES:${PN} += "dpic"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
