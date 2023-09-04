SUMMARY = "A process utilities module for Python"
DESCRIPTION = "A graphical interface that lets you easily analyze and introspect unaltered running Python processes."
LICENSE = "BSD-3-Clause"

PV = "5.9.5"

RPM_NAME = "python39-psutil-5.9.5-2.1.aarch64.rpm"
RPM_HASH = "a25355335644fcf5aa21b7b5493631ef622a54c1972d952b2db932afefb57b2e5a033e996dc9ba87e72b4d6e6c0844454a5e6db40ae1b8ee35df20f0cb453507"

RPROVIDES:${PN} += "python3.9dist-psutil \
python39-psutil \
python3dist-psutil"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
procps \
python-abi"

inherit rpm
