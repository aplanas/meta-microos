SUMMARY = "SASL Authentication framework"
DESCRIPTION = "SASL is a generic mechanism for authentication used by several network \
protocols. *Authen::SASL* provides an implementation framework that all \
protocols should be able to share. \
 \
The framework allows different implementations of the connection class to \
be plugged in. At the time of writing there were two such plugins. \
 \
* Authen::SASL::Perl \
 \
This module implements several mechanisms and is implemented entirely in \
Perl. \
 \
* Authen::SASL::XS \
 \
This module uses the Cyrus SASL C-library (both version 1 and 2 are \
supported). \
 \
* Authen::SASL::Cyrus \
 \
This module is the predecessor to Authen::SASL::XS. \
 \
Until version 2.16, Authen::SASL::Cyrus was loaded as an alternative to \
Authen::SASL::XS. \
 \
By default Authen::SASL tries to load Authen::SASL::XS first, followed by \
Authen::SASL::Perl on failure. If you want to change the order or want to \
specifically use one implementation only simply do \
 \
 use Authen::SASL qw(Perl); \
 \
or if you have another plugin module that supports the Authen::SASL API \
 \
 use Authen::SASL qw(My::SASL::Plugin);"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.170.0"

RPM_NAME = "perl-Authen-SASL-2.170.0-1.1.noarch.rpm"
RPM_HASH = "1eb60170cb2326a833301e07189dc11987df926e51790eb7650b07197453568f2dbdb299bba2f28fc4619f35e230a6d78a5daee834145ec663c23b744ac5da30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Authen--SASL \
perl-Authen--SASL--CRAM-MD5 \
perl-Authen--SASL--EXTERNAL \
perl-Authen--SASL--Perl \
perl-Authen--SASL--Perl--ANONYMOUS \
perl-Authen--SASL--Perl--CRAM-MD5 \
perl-Authen--SASL--Perl--DIGEST-MD5 \
perl-Authen--SASL--Perl--EXTERNAL \
perl-Authen--SASL--Perl--GSSAPI \
perl-Authen--SASL--Perl--LOGIN \
perl-Authen--SASL--Perl--PLAIN \
perl-Authen-SASL"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Digest--HMAC-MD5"

inherit rpm
