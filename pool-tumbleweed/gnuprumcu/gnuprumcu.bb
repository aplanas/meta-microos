SUMMARY = "Linker scripts and device specs for PRU MCU variants"
DESCRIPTION = "This package contains the linker scripts, device specs and I/O headers for the \
different PRU variants in different TI SoCs. Install this package to allow the \
'-mmcu=' GCC compiler option to pick the correct settings for your board."
LICENSE = "BSD-2-Clause"

PV = "0.8.0"

RPM_NAME = "gnuprumcu-0.8.0-1.2.noarch.rpm"
RPM_HASH = "78f795b122e73e5ac63c265d9d7e7add81d923fc3a3eeec1111941f7eda551d54dd3039724672a6e2c791032515ed5c5b1344cf5b33f221190546b8183c6cd7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnuprumcu"

RDEPENDS:${PN} += ""

inherit rpm
