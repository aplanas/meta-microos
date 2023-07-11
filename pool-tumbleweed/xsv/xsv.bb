SUMMARY = "A fast CSV toolkit written in Rust"
DESCRIPTION = "xsv is a command line program for indexing, slicing, analyzing, \
splitting and joining CSV files."
LICENSE = "MIT | Unlicense"

PV = "0.13.0"

RPM_NAME = "xsv-0.13.0-2.9.aarch64.rpm"
RPM_HASH = "2a9b17dab7f148ed5540e931508504cd558e524fc9f7bcd7072c79120c59c9069ff1d9199bbf44890e6aedf95ee8e7cf2cda57c7a686d71d7306e5e6c54013c4"

RPROVIDES:${PN} += "xsv"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
