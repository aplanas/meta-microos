SUMMARY = "Organize Data in Tables"
DESCRIPTION = "Organization of data in table form is a time-honored and useful method of \
data representation. While columns of data are trivially generated by \
computer through formatted output, even simple tasks like keeping titles \
aligned with the data columns are not trivial, and the one-shot solutions \
one comes up with tend to be particularly hard to maintain. Text::Table \
allows you to create and maintain tables that adapt to alignment \
requirements as you use them."
LICENSE = "ISC"

PV = "1.135"

RPM_NAME = "perl-Text-Table-1.135-1.2.noarch.rpm"
RPM_HASH = "fc5e14f956f3624075870cc098755189cca9ca46d93e8ee0a49925d0e082d56b60fdc04553fd086a39dfbf8942c5a9e9bee368fafe4ea744ab1201423bee26c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--Table \
perl-Text-Table"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Text--Aligner"

inherit rpm
