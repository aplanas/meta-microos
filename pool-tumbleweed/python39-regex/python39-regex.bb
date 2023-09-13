SUMMARY = "Alternative regular expression module for Python"
DESCRIPTION = "An alternate regex implementation. It differs from 're' in that \
 \
* Zero-width matches are handled like in Perl and PCRE: \
  * ``.split`` will split a string at a zero-width match. \
  * ``.sub`` will handle zero-width matches correctly. \
* Inline flags apply to the end of the group or pattern, and they can \
  be turned off. \
* Nested sets and set operations are supported. \
* Case-insensitive matches in Unicode use full case-folding by \
  default."
LICENSE = "Apache-2.0"

PV = "2023.8.8"

RPM_NAME = "python39-regex-2023.8.8-1.1.aarch64.rpm"
RPM_HASH = "369d7fe25dc50de394671ea6867932e07501193848d95818c2f4aa63a81cfec595167047d3423cf87786accf00724200d592f58ff6d431fb58a4ada5f5f81e60"

RPROVIDES:${PN} += "python3.9dist-regex \
python39-regex \
python3dist-regex"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
