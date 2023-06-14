SUMMARY = "Caslon TrueType Fonts"
DESCRIPTION = "The Caslon TrueType font is a partial implementation of Unicode. I does \
not contain \
 \
* CJK characters (ideographs) \
 \
* Asian & Indian alphabets and sylabaries \
 \
* Arabic \
 \
but it contains enough for most European languages including the \
euro-sign."
LICENSE = "BSD-3-Clause"

PV = "20031202"

RPM_NAME = "caslon-fonts-20031202-252.17.noarch.rpm"
RPM_HASH = "0a3f435f31361f9514dcb273076b2e50472ac25c39c7224944088e22b80867483e67b9973b5a22303f8380bf216cea732fee911347310347ddb363a574d7c881"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "caslon-fonts \
scalable-font-bg \
scalable-font-el \
scalable-font-he \
scalable-font-ru"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
