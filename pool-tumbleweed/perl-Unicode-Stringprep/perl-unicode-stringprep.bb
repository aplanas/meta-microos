SUMMARY = "Preparation of Internationalized Strings (S<RFC 3454>)"
DESCRIPTION = "This module implements the _stringprep_ framework for preparing Unicode \
text strings in order to increase the likelihood that string input and \
string comparison work in ways that make sense for typical users throughout \
the world. The _stringprep_ protocol is useful for protocol identifier \
values, company and personal names, internationalized domain names, and \
other text strings. \
 \
The _stringprep_ framework does not specify how protocols should prepare \
text strings. Protocols must create profiles of stringprep in order to \
fully specify the processing options."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.105"

RPM_NAME = "perl-Unicode-Stringprep-1.105-1.26.noarch.rpm"
RPM_HASH = "134665915f5cc617f86ba690daa4a00f7b8b2830274e2fd4c41911ce1f28932f6001a83043a58467f2cc17619c8332a76519a2a879e345ac8ac6e437bc3cf10a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Unicode--Stringprep \
perl-Unicode--Stringprep---Common \
perl-Unicode--Stringprep--BiDi \
perl-Unicode--Stringprep--Mapping \
perl-Unicode--Stringprep--Prohibited \
perl-Unicode--Stringprep--Unassigned \
perl-Unicode-Stringprep"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Unicode--Normalize"

inherit rpm
