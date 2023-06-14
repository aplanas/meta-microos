SUMMARY = "A Free Monospace Font"
DESCRIPTION = "Anonymous Pro is a family of four fixed-width fonts designed especially \
with coding in mind. Characters that could be mistaken for one another \
(O, 0, I, l, 1, etc.) have distinct shapes to make them easier to tell \
apart in the context of source code. \
 \
Anonymous Pro also features an international, Unicode-based character set, \
with support for most Western and European Latin-based languages, Greek, \
and Cyrillic. It also includes special 'box drawing' characters for those \
who need them. \
 \
Designer: Mark Simonson"
LICENSE = "OFL-1.1"

PV = "1.002"

RPM_NAME = "google-anonymouspro-fonts-1.002-11.17.noarch.rpm"
RPM_HASH = "ae1e8c538491912aeeabab9344b3f59f98ad949078deedd7fdfd3bfeebf325b8c4f3af91fbf4415989065e4ab07f3e3f8e2aa90607b7c7e848751c2f37eb98ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-anonymouspro-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
