SUMMARY = "Patched dd with Computer Forensics Features"
DESCRIPTION = "dc3dd is a patched version of GNU dd to include a number of features useful \
for computer forensics. Many of these features were inspired by dcfldd, but \
were rewritten for dc3dd. \
 \
* Pattern writes. The program can write a single hexadecimal value or a text \
  string to the output device for wiping purposes. \
* Piecewise and overall hashing with multiple algorithms and variable size \
  windows. Supports MD5, SHA-1, SHA-256, and SHA-512. Hashes can be computed \
  before or after conversions are made. \
* Progress meter with automatic input/output file size probing \
* Combined log for hashes and errors \
* Error grouping. Produces one error message for identical sequential errors \
* Verify mode. Able to repeat any transformations done to the input file and \
  compare it to an output. \
* Ability to split the output into chunks with numerical or alphabetic \
  extensions"
LICENSE = "GPL-3.0-only"

PV = "7.3.1"

RPM_NAME = "dc3dd-7.3.1-1.1.aarch64.rpm"
RPM_HASH = "b4ed013d4c7ffd25cfe1a14cbccbaeb685c2b047ab930985b35446cdc99ec5841b8524d1b93553ff8de610841bb172573b1726f905cc166fecabc459004e1758"

RPROVIDES:${PN} += "dc3dd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
