SUMMARY = "A command-line hex viewer"
DESCRIPTION = "hexyl is a simple hex viewer for the terminal. It uses a colored output \
to distinguish different categories of bytes (NUL bytes, printable \
ASCII characters, ASCII whitespace characters, other ASCII characters \
and non-ASCII)."
LICENSE = "Apache-2.0"

PV = "0.13.0"

RPM_NAME = "hexyl-0.13.0-1.2.aarch64.rpm"
RPM_HASH = "2a57464c36dd2c5d1e11a723ed791ad7af1fcfa7cfb35f4a3eceb6ec7a8a243456b33fde76490356278e6994ce916343e803991dfa1c4294e41068c114dc69f8"

RPROVIDES:${PN} += "hexyl"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
