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

RPM_NAME = "python311-regex-2023.8.8-1.1.aarch64.rpm"
RPM_HASH = "16adbb2109b353eeccb7bad8419db16cf3c7b3ae9890d90fa7238f5dccfa96be084e09137d51afe138cf64b4401983da32b4231ff2f19596b0cc60443f1d1397"

RPROVIDES:${PN} += "python3-regex \
python3.11dist-regex \
python311-regex \
python3dist-regex"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
