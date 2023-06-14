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

RPM_NAME = "python39-regex-2023.5.5-1.1.aarch64.rpm"
RPM_HASH = "272c04f84de982f1c375e16f390fea5acdc0862688e0f151176f30ed7ffe7bb1d0734054e18f9bff505c80322b3ef4d734f4ff3db52d772ef82419e9fdf56107"

RPROVIDES:${PN} += "python3.9dist-regex \
python39-regex \
python3dist-regex"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
