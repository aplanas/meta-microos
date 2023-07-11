SUMMARY = "Input Method data for non-CJK languages, including Russian etc"
DESCRIPTION = "Input Method data for non-CJK languages, including Russian etc. for the \
scim-tables input method module."
LICENSE = "GPL-2.0+"

PV = "0.5.14.1"

RPM_NAME = "scim-tables-additional-0.5.14.1-2.32.aarch64.rpm"
RPM_HASH = "18bcc9b2b02b0b8a67ed6728a55d9d4af91f20c3bb4692c87c033aa2a66fe191682ec7698e1936389cba760075cedf0cf925c75d4c846a78b2787a9dd1dfd662"

RPROVIDES:${PN} += "locale-scim-tables-am;ar;bn;gu;hi;kn;ml;ne;pa;ru;ta;te;th;vi \
scim-tables-additional"

RDEPENDS:${PN} += "scim-tables"

inherit rpm
