SUMMARY = "Description of Finnish morphology written for libvoikko"
DESCRIPTION = "Voikko-fi (previously known as suomi-malaga) is a description of Finnish \
morphology written for libvoikko. \
 \
This package contains a compiled version of Voikko-fi using the new \
unweighted VFST dictionary format. It is suitable for use in spell checking, \
grammar checking and hyphenation system Voikko, provided by the libvoikko \
library."
LICENSE = "GPL-2.0-or-later"

PV = "2.5"

RPM_NAME = "malaga-suomi-2.5-1.3.noarch.rpm"
RPM_HASH = "f8b7f04b551de7b6c14cc4683d16792c143b55deee81e58f78d999fcd3c9e2a7d2b4c0c5bc363b15775a106ffe22b325e8a61e6ee6772922cc1dd21f27309d67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "malaga-suomi \
suomi-malaga \
voikko-fi"
RDEPENDS:${PN} += ""

inherit rpm
