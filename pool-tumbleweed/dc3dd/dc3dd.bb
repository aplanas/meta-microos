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

PV = "7.2.646"

RPM_NAME = "dc3dd-7.2.646-4.9.aarch64.rpm"
RPM_HASH = "8967c7f2047c83ebc898ab79f1e5afee4d3f8c6a8e970636175bf0eaeebb8a2cd2ff83099bfb717fb76ce93a2b25efb71e50db9da77c13a4df162557e0d59b4f"

RPROVIDES:${PN} += "dc3dd \
dc3dd(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
