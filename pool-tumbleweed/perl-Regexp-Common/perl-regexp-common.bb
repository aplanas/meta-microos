SUMMARY = "Provide commonly requested regular expressions"
DESCRIPTION = "By default, this module exports a single hash ('%RE') that stores or \
generates commonly needed regular expressions (see 'List of available \
patterns'). \
 \
There is an alternative, subroutine-based syntax described in \
'Subroutine-based interface'."
LICENSE = "Artistic-1.0 | Artistic-2.0 | BSD-3-Clause | MIT"

PV = "2017060201"

RPM_NAME = "perl-Regexp-Common-2017060201-1.23.noarch.rpm"
RPM_HASH = "26c40a808bd20e7d979154061ecce5a9f40f6a2bb20a668e4044f2e6ae3a74cc0672178446fa0751e96505a5b97a26703fdb446b5e57140cb4e08736bbc121b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Regexp--Common \
perl-Regexp--Common---support \
perl-Regexp--Common--CC \
perl-Regexp--Common--Entry \
perl-Regexp--Common--SEN \
perl-Regexp--Common--URI \
perl-Regexp--Common--URI--RFC1035 \
perl-Regexp--Common--URI--RFC1738 \
perl-Regexp--Common--URI--RFC1808 \
perl-Regexp--Common--URI--RFC2384 \
perl-Regexp--Common--URI--RFC2396 \
perl-Regexp--Common--URI--RFC2806 \
perl-Regexp--Common--URI--fax \
perl-Regexp--Common--URI--file \
perl-Regexp--Common--URI--ftp \
perl-Regexp--Common--URI--gopher \
perl-Regexp--Common--URI--http \
perl-Regexp--Common--URI--news \
perl-Regexp--Common--URI--pop \
perl-Regexp--Common--URI--prospero \
perl-Regexp--Common--URI--tel \
perl-Regexp--Common--URI--telnet \
perl-Regexp--Common--URI--tv \
perl-Regexp--Common--URI--wais \
perl-Regexp--Common--balanced \
perl-Regexp--Common--comment \
perl-Regexp--Common--delimited \
perl-Regexp--Common--lingua \
perl-Regexp--Common--list \
perl-Regexp--Common--net \
perl-Regexp--Common--number \
perl-Regexp--Common--profanity \
perl-Regexp--Common--whitespace \
perl-Regexp--Common--zip \
perl-Regexp-Common"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
