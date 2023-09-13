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

RPM_NAME = "python310-regex-2023.8.8-1.1.aarch64.rpm"
RPM_HASH = "46e88dba58ed8194fcb78a77e1edc60d9366fa0a9c83700a3952dd6dece7a44cd8f2e504d8b765e02ae619622584013487cc2f6e7b251e8af5aac9be1fffaeda"

RPROVIDES:${PN} += "python3.10dist-regex \
python310-regex \
python3dist-regex"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
