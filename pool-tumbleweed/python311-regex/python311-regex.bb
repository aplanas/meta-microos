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

RPM_NAME = "python311-regex-2023.5.5-1.2.aarch64.rpm"
RPM_HASH = "91151724daf93f8981f85e468d050ac9118631454fe85dad3c092f7596a34f33d8d06b42f695d520686cb82d26d089dde1c0777a940ca4e930ef721991692aa0"

RPROVIDES:${PN} += "python3-regex \
python3.11dist-regex \
python311-regex \
python3dist-regex"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
