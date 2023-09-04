SUMMARY = "TeX and LaTeX to XML translator"
DESCRIPTION = "LaTeXML is a TeX & LaTeX to XML, HTML, MathML, ePub, JATS, ... converter."
LICENSE = "SUSE-Public-Domain"

PV = "0.8.7"

RPM_NAME = "LaTeXML-0.8.7-1.4.noarch.rpm"
RPM_HASH = "c989aa46ec93e289da54267203babc4b35378a8cd53e6cf63eefae3cfa55308ad604ce702983b668779e75a6a227e5a050a58a5cd46dfb30d14d6ec728588b53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "LaTeXML"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0 \
perl-Archive--Zip \
perl-DB-File \
perl-File--Which \
perl-Getopt--Long \
perl-IO--String \
perl-Image--Size \
perl-JSON--XS \
perl-LWP--Protocol--https \
perl-LaTeXML \
perl-Parse--RecDescent \
perl-Pod--Find \
perl-Test--Simple \
perl-Text--Unidecode \
perl-Time--HiRes \
perl-URI \
perl-UUID--Tiny \
perl-XML--LibXML \
perl-XML--LibXSLT"

inherit rpm
