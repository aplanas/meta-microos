SUMMARY = "Command-line utility for storage conversions and calculations"
DESCRIPTION = "bcal (Byte CALculator) is a command-line utility for storage, hardware and \
firmware developers who deal with storage-specific numerical calculations, \
expressions, unit conversions or address calculations frequently. If you are one \
and cannot calculate the hex address offset for (512 - 16) MiB immediately, or \
the value when the 43rd bit of a 64-bit address is set, bcal is for you."
LICENSE = "GPL-3.0-only"

PV = "2.4"

RPM_NAME = "bcal-2.4-1.5.aarch64.rpm"
RPM_HASH = "d4457346a172a60cba8869b88de32d44e3edc55cf121c0f3dc0d397ea1bb8f7b394cc6d74796e8e7d1585cf7964d32056d617902466ac0b48bb8b6a23eaa61a6"

RPROVIDES:${PN} += "bcal"

RDEPENDS:${PN} += "libc.so.6 \
libreadline.so.8"

inherit rpm
