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

PV = "2023.5.5"

RPM_NAME = "python310-regex-2023.5.5-1.2.aarch64.rpm"
RPM_HASH = "f51ce75cd91d4d2a289c687ef36c659f91920d46300926d017ae9e3fb1895ba4d84cdb9b1f3298cbe36f1b0ba9be5699559cfee443e4f4b602fe2bd84c49926a"

RPROVIDES:${PN} += "python3.10dist-regex \
python310-regex \
python3dist-regex"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
