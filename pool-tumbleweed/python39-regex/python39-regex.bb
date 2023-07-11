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

RPM_NAME = "python39-regex-2023.5.5-1.2.aarch64.rpm"
RPM_HASH = "628a0df4803bcb1b4ed9032691261effcfc8b028a0ac382d9fc62b4d09a6a7247a366ac5ffd1412df5230dc2197a2c0ce224d56f8e823a31d5bac1140730393d"

RPROVIDES:${PN} += "python3.9dist-regex \
python39-regex \
python3dist-regex"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
