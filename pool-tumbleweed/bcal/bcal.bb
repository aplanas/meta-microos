SUMMARY = "Command-line utility for storage conversions and calculations"
DESCRIPTION = "bcal (Byte CALculator) is a command-line utility for storage, hardware and \
firmware developers who deal with storage-specific numerical calculations, \
expressions, unit conversions or address calculations frequently. If you are one \
and cannot calculate the hex address offset for (512 - 16) MiB immediately, or \
the value when the 43rd bit of a 64-bit address is set, bcal is for you."
LICENSE = "GPL-3.0-only"

PV = "2.4"

RPM_NAME = "bcal-2.4-1.6.aarch64.rpm"
RPM_HASH = "f750d8812c73884dffec1cca07b581f2287875e69da4219da12838e64a16bb911c5d16f8e54cbe3bc8b6b8218d61e75f77dd287691862345bd1d7706a1d6e43c"

RPROVIDES:${PN} += "bcal"

RDEPENDS:${PN} += "libc.so.6 \
libreadline.so.8"

inherit rpm
