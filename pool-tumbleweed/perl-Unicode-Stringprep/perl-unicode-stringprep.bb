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

RPM_NAME = "perl-Unicode-Stringprep-1.105-1.27.noarch.rpm"
RPM_HASH = "b2b5ba819a36322b53812a1516d734d94ed304d0045b93673babf0e8fb07537e072768809941330a39b49d1cce132a24ef8c7996f183cde0f7679755c71e3ee6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Unicode--Stringprep \
perl-Unicode--Stringprep---Common \
perl-Unicode--Stringprep--BiDi \
perl-Unicode--Stringprep--Mapping \
perl-Unicode--Stringprep--Prohibited \
perl-Unicode--Stringprep--Unassigned \
perl-Unicode-Stringprep"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Unicode--Normalize"

inherit rpm
