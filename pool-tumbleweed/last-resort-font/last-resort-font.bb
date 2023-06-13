SUMMARY = "A special-purpose font that includes a collection of glyphs to represent types of Unicode characters"
DESCRIPTION = "Last Resort is a special-purpose font that includes a collection of glyphs to represent types of Unicode characters. \
These glyphs are specifically designed to allow users to recognize that a code point is one of the following: \
 \
* A specific type of Unicode character \
* In the PUA (Private Use Area) for which no agreement exists \
* Unassigned (reserved for future assignment) \
* A noncharacter"
LICENSE = "OFL-1.1"

PV = "13.001"

RPM_NAME = "last-resort-font-13.001-1.8.noarch.rpm"
RPM_HASH = "5db698de9453bd975a69cfd5d721d8c3743bfc0fe5c283204ff0b1ea11fcaaa911e052a92b3bc0efa57d6e558196ba622575e471b37559187868fc0a8a575850"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "last-resort-font"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
