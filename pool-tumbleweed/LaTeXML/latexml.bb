SUMMARY = "TeX and LaTeX to XML translator"
DESCRIPTION = "LaTeXML is a TeX & LaTeX to XML, HTML, MathML, ePub, JATS, ... converter."
LICENSE = "SUSE-Public-Domain"

PV = "0.8.7"

RPM_NAME = "LaTeXML-0.8.7-1.3.noarch.rpm"
RPM_HASH = "0ccb29a2ffc7e0e95858bc03e9c623f3e38221e00b23a03ffdaafe63b19679655a777e3c7f1f35aad6bce5b267e436f146cb43a08887a560fc5b2e2d5d74700d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "LaTeXML"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1 \
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
